package com.epam.race.specification.bet;

import com.epam.race.exception.RepositoryException;
import com.epam.race.specification.SQLFunction;
import com.epam.race.specification.SQLSpecification;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SelectBetsByRaceIdSpecification implements SQLSpecification {

    private int raceId;

    public SelectBetsByRaceIdSpecification(int raceId) {
        this.raceId = raceId;
    }

    @Override
    public PreparedStatement getStatement(SQLFunction<String, PreparedStatement, SQLException> function)
            throws RepositoryException {
        try{
            PreparedStatement statement = function.apply(SqlBetConstant.SQL_BETS_SELECT_BY_RACE_ID);
            fillStatement(statement);
            return statement;

        }catch (SQLException e){
            throw new RepositoryException(e);
        }
    }

    @Override
    public void fillStatement(PreparedStatement statement) throws RepositoryException {
        try{
            statement.setInt(1,raceId);
        }catch (SQLException e){
            throw new RepositoryException(e);
        }
    }
}
