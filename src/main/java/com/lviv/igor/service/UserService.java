package com.lviv.igor.service;

import com.lviv.igor.dao.inter.UserDAO;
import com.lviv.igor.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    UserDAO userDAO;
    
    public User getUserById(Integer id){
       return userDAO.getUserById(id);
    }
}
