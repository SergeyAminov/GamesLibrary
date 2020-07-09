package com.aminov.dao;

import com.aminov.model.Game;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

/*

This class is used only for example instead of connecting to any Data Base.

*/

public class GameDAOImpl implements GameDAO {

    private static final AtomicInteger AUTO_ID = new AtomicInteger(0);
    private static Map<Integer, Game> games = new HashMap<>();

    static {
        Game game1 = new Game();
        game1.setTitle("The last of us");
        game1.setYear(2013);
        game1.setGenre("Adventure");
        game1.setPlayed(true);
        games.put(game1.getId(), game1);

        Game game2 = new Game();
        game2.setTitle("GTA 5");
        game2.setYear(2013);
        game2.setGenre("Sandbox");
        game2.setPlayed(true);
        games.put(game2.getId(), game2);

        Game game3 = new Game();
        game3.setTitle("Civilization 6");
        game3.setYear(2016);
        game3.setGenre("Strategy");
        game3.setPlayed(false);
        games.put(game3.getId(), game3);

        Game game4 = new Game();
        game4.setTitle("Halo 3");
        game4.setYear(2007);
        game4.setGenre("Shooter");
        game4.setPlayed(true);
        games.put(game4.getId(), game4);

        Game game5 = new Game();
        game5.setTitle("Warcraft 3");
        game5.setYear(2003);
        game5.setGenre("Strategy");
        game5.setPlayed(true);
        games.put(game5.getId(), game5);
    }

    @Override
    public List<Game> allGames() {
        return new ArrayList<>(games.values());
    }

    @Override
    public void add(Game game) {
        game.setId(AUTO_ID.getAndIncrement());
        games.put(game.getId(), game);
    }

    @Override
    public void delete(Game game) {
        games.remove(game.getId());
    }

    @Override
    public void edit(Game game) {
        games.put(game.getId(), game);
    }

    @Override
    public Game getById(int id) {
        return games.get(id);
    }

}
