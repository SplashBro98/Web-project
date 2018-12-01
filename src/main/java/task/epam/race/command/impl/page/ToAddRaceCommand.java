package task.epam.race.command.impl.page;

import task.epam.race.command.Command;
import task.epam.race.servlet.ConfigurationManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class ToAddRaceCommand implements Command {

    @Override
    public String execute(HttpServletRequest req) {
        return ConfigurationManager.INSTANCE.getProperty(ConfigurationManager.PATH_ADD_RACE_PAGE);
    }
}
