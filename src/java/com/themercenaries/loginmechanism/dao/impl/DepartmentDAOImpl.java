/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.themercenaries.loginmechanism.dao.impl;

import com.themercenaries.loginmechanism.dao.DepartmentDAO;
import com.themercenaries.loginmechanism.entity.Department;
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
@Repository
public class DepartmentDAOImpl implements DepartmentDAO{
    @Autowired
    SessionFactory sessionFactory;
    
    Session session;
    Transaction trans;
    
    @Override
    public List<Department> getAll() {
        session = sessionFactory.openSession();
        Query query = session.getNamedQuery("Department.findAll");
        List<Department> departments = query.list();
        session.close();
        return departments;
    }

    @Override
    public void insert(Department t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Department t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Department getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
