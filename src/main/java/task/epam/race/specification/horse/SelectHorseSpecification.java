package task.epam.race.specification.horse;

import task.epam.race.specification.SQLFunction;
import task.epam.race.specification.SQLSpecification;
import task.epam.race.util.constant.SQLConstant;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SelectHorseSpecification implements SQLSpecification {

    private String name;

    public SelectHorseSpecification(String name) {
        this.name = name;
    }

    @Override
    public PreparedStatement getStatement(SQLFunction<String, PreparedStatement> function) throws SQLException {
        PreparedStatement statement = function.apply(SQLConstant.SQL_HORSES_SELECT_BY_NAME);
        fillStatement(statement);
        return statement;
    }

    @Override
    public void fillStatement(PreparedStatement statement) throws SQLException {
        statement.setString(1,name);
    }
}
