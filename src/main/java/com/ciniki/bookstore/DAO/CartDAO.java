package com.ciniki.bookstore.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ciniki.bookstore.pojo.Cart;
import com.ciniki.bookstore.pojo.Book;
import com.ciniki.bookstore.pojo.User;

import java.util.List;

public interface CartDAO extends JpaRepository<Cart, Integer>{
    List<Cart> findAllByUser(User user);
    List<Cart> findAllByBook(Book book);
}
