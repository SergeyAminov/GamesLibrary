package com.aminov.dao;

import com.aminov.model.Game;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class GameDAOImpl implements GameDAO {
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
        Session session = sessionFactory.getCurrentSession();
        session.persist(game);
    }

    @Override
    public void delete(Game game) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(game);
    }

    @Override
    public void edit(Game game) {
        Session session = sessionFactory.getCurrentSession();
        session.update(game);
    }

    @Override
    public Game getById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Game.class, id);
    }

}
