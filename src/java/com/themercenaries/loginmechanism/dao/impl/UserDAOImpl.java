/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.themercenaries.loginmechanism.dao.impl;

import com.themercenaries.loginmechanism.dao.UserDAO;
import com.themercenaries.loginmechanism.entity.User;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sumanheuju
 */
@Repository(value = "uDAO")
public class UserDAOImpl implements UserDAO{
    
    @Autowired
    SessionFactory sessionFactory;
    Session session;
    Transaction trans;
    
    @Override
    public List<User> getAll() {
        session = sessionFactory.openSession();
        Query query = session.getNamedQuery("User.findAll");
        List<User> users = query.list();
        session.close();
        return users;
    }

    @Override
    public void insert(User u) {
        session = sessionFactory.openSession();
        trans = session.beginTransaction();
        session.save(u);
        trans.commit();
        session.close();
        
    }

    @Override
    public void update(User t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
