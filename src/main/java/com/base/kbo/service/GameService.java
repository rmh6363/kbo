package com.base.kbo.service;

import com.base.kbo.domain.Game;

import java.util.List;

public interface GameService {
    List<Game> findTeamRanking(Game game);
}
