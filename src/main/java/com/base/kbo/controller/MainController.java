package com.base.kbo.controller;

import com.base.kbo.domain.Game;
import com.base.kbo.repository.GameRepository;
import com.base.kbo.service.GameService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpRequest;
import java.util.List;

@RestController
@RequestMapping(value = "/kbo")
public class MainController {
    private final GameService gameService;

    @Autowired
    public MainController(GameService gameService) {
        this.gameService = gameService;
    }
    @RequestMapping(value = "/main.do",method = RequestMethod.GET)
    public String main(HttpServletRequest request, HttpServletResponse response) throws Exception{
        List<Game> teamRanking = gameService.findTeamRanking(new Game());
        return "";
    }
}
