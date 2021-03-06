package com.epam.race.command.impl;

import com.epam.race.command.Command;
import com.epam.race.command.PageManager;
import com.epam.race.entity.Race;
import com.epam.race.service.RaceService;
import com.epam.race.util.constant.StringAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class PaginationCommand implements Command {

    @Override
    public String execute(HttpServletRequest req) {

        int currentPage = Integer.parseInt(req.getParameter("currentPage"));

        RaceService raceService = new RaceService(currentPage,5);



        req.getSession().setAttribute(StringAttributes.RACES,raceService.findCurrentRaces());

        req.getSession().setAttribute("currentPage",raceService.getCurrentPage());
        req.getSession().setAttribute("numberOfPages", raceService.getNumberOfPages());

        return PageManager.INSTANCE.getProperty(PageManager.PATH_MAIN_PAGE);

    }
}
