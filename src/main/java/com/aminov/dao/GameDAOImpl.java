package com.aminov.dao;

import com.aminov.model.Game;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class GameDAOImpl implements GameDAO {

    private static final AtomicInteger AUTO_ID = new AtomicInteger(0);
    private static Map<Integer, Game> games = new HashMap<>();
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Game> allGames() {
        Session session = sessionFactory.getCurrentSession();

        /*

        Unsaved conversion has to be corrected here!!!

        */
        return session.createQuery("from Game").list();
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
