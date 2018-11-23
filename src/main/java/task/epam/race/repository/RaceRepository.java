package task.epam.race.repository;

import task.epam.race.entity.Race;
import task.epam.race.specification.SQLSpecification;
import task.epam.race.specification.race.InsertRaceSpecification;
import task.epam.race.specification.race.SelectAllRacesSpecification;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class RaceRepository extends AbstractRepository<Race> {
    private static RaceRepository instance;

    private RaceRepository() {

    }

    public static RaceRepository getInstance(){
        if(instance == null){
            instance = new RaceRepository();
        }
        return instance;
    }

    @Override
    public Race createItem(ResultSet resultSet) throws SQLException {
        Race newRace = new Race();
        newRace.setRaceId(resultSet.getInt(1));
        newRace.setName(resultSet.getString("name"));
        newRace.setPlace(resultSet.getString("place"));
        newRace.setDate(resultSet.getDate("date").toLocalDate());
        newRace.setTime(resultSet.getTime("time").toLocalTime());
        return newRace;
    }

    @Override
    public void add(Race race) throws SQLException {
        nonSelectQuery(new InsertRaceSpecification(race));
    }

    @Override
    public void remove(Race race) throws SQLException {

    }

    @Override
    public void update(Race race) throws SQLException {

    }

    @Override
    public List<Race> query(SQLSpecification specification) throws SQLException {
        return selectQuery(specification);
    }
}