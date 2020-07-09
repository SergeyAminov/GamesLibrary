package com.aminov.dao;

import com.aminov.model.Game;
import java.util.List;

/*

Current interface imitates interaction with Data Base.

 */

public interface GameDAO {
    List<Game> allGames();
    void add(Game game);
    void delete(Game game);
    void edit(Game game);
    Game getById(int id);
}