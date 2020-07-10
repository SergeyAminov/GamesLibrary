package com.aminov.service;

import com.aminov.dao.GameDAO;
import com.aminov.dao.GameDAOImpl;
import com.aminov.model.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameServiceImpl implements GameService {

    private GameDAO gameDAO;

    @Autowired
    public void setGameDAO(GameDAO gameDAO){
        this.gameDAO = gameDAO;
    }

    @Override
    @Transactional
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