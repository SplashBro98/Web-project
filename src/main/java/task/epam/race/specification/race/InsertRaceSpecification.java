package task.epam.race.specification.race;

import task.epam.race.entity.Race;
import task.epam.race.specification.SQLFunction;
import task.epam.race.specification.SQLSpecification;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

public class InsertRaceSpecification implements SQLSpecification {

    private Race race;

    public InsertRaceSpecification(Race race) {
        this.race = race;
    }

    @Override
    public PreparedStatement getStatement(SQLFunction<String, PreparedStatement> function) throws SQLException {
        PreparedStatement statement = function.apply(SQLRaceConstant.SQL_RACES_INSERT);
        fillStatement(statement);
        return statement;
    }

    @Override
    public void fillStatement(PreparedStatement statement) throws SQLException {
        statement.setString(1,race.getName());
        statement.setString(2,race.getPlace());
        statement.setDate(3,Date.valueOf(race.getDate()));
        statement.setTime(4, Time.valueOf(race.getTime()));
    }
}
