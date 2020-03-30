package com.ciniki.bookstore.DAO;

import com.ciniki.bookstore.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User, Integer>{
    User findByUsername(String username);
    User getByUsernameAndPassword(String username, String password);
}
