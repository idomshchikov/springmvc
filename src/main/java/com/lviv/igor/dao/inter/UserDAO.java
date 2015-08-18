package com.lviv.igor.dao.inter;

import com.lviv.igor.model.User;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public interface UserDAO {
    
    public User getUserById(Integer id);
}
