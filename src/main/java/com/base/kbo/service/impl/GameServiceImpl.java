package com.base.kbo.service.impl;

import com.base.kbo.domain.Game;
import com.base.kbo.repository.GameRepository;
import com.base.kbo.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameServiceImpl implements GameService {
    private final GameRepository gameRepository;
    @Autowired
    public GameServiceImpl(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Override
    public List<Game> findTeamRanking(Game game) {
        return gameRepository.findAll();
    }
}
