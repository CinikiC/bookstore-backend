package com.ciniki.bookstore.services;

import com.ciniki.bookstore.pojo.User;
import com.ciniki.bookstore.DAO.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDAO userDAO;

    public boolean isExist(String username) {
        User user = getByName(username);
        return null!=user;
    }

    public User get(int uid) {
        User user = userDAO.findById(uid).orElse(null);
        return user;
    }

    public User getByName(String username) {
        return userDAO.findByUsername(username);
    }

    public User getByNameAndPassword(String username, String password) {
        return userDAO.getByUsernameAndPassword(username, password);
    }

    public void add(User user) {
        userDAO.save(user);
    }
}
