package com.aminov.service;

import com.aminov.dao.GameDAO;
import com.aminov.dao.GameDAOImpl;
import com.aminov.model.Game;

import java.util.List;

public class GameServiceImpl implements GameService {

    private GameDAO gameDAO = new GameDAOImpl();

    @Override
    public List<Game> allGames() {
        return gameDAO.allGames();
    }

    @Override
    public void add(Game game) {
        gameDAO.add(game);
    }

    @Override
    public void delete(Game game) {
        gameDAO.delete(game);
    }

    @Override
    public void edit(Game game) {
        gameDAO.edit(game);
    }

    @Override
    public Game getById(int id) {
        return gameDAO.getById(id);
    }
}