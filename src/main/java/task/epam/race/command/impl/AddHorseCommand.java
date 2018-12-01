package task.epam.race.command.impl;

import task.epam.race.command.Command;
import task.epam.race.entity.Horse;
import task.epam.race.repository.HorseRepository;
import task.epam.race.service.MainPageService;
import task.epam.race.servlet.ConfigurationManager;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

public class AddHorseCommand implements Command {

    @Override
    public String execute(HttpServletRequest req) {
        Horse horse = new Horse();
        horse.setName(req.getParameter("name"));
        horse.setAge(Integer.parseInt(req.getParameter("age")));
        horse.setWins(Integer.parseInt(req.getParameter("wins")));

        String page;
        try{
            HorseRepository.getInstance().add(horse);

            new MainPageService().setAttributes(req);
            page = ConfigurationManager.INSTANCE.getProperty(ConfigurationManager.PATH_MAIN_PAGE);
        }catch (SQLException e){
            page = ConfigurationManager.INSTANCE.getProperty(ConfigurationManager.PATH_ERROR_PAGE);
        }
        return page;
    }
}
