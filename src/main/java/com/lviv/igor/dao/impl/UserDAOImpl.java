package com.lviv.igor.dao.impl;

import com.lviv.igor.dao.inter.UserDAO;
import com.lviv.igor.model.User;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    SessionFactory sessionFactory;
    
    @Override
    public User getUserById(Integer id) {
       Session session =  sessionFactory.openSession();
       session.beginTransaction();
       User user = (User) session.get(User.class, 1);
       return user;
    }
}
