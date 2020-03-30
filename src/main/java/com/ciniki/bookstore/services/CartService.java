package com.ciniki.bookstore.services;

import com.ciniki.bookstore.DAO.CartDAO;
import com.ciniki.bookstore.pojo.Book;
import com.ciniki.bookstore.pojo.User;
import com.ciniki.bookstore.pojo.Cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
    @Autowired
    CartDAO cartDAO;

    @Autowired
    BookService bookService;

    @Autowired
    UserService userService;

    public List<Cart> list() {
        return cartDAO.findAll(Sort.by(Sort.Direction.DESC, "cartid"));
    }

    public void addOrUpdate(Cart cart) {
        cartDAO.save(cart);
    }

    public void deleteByCartId(int cartid) {
        cartDAO.deleteById(cartid);
    }

    public List<Cart> listByUser(int uid) {
        User user = userService.get(uid);
        return cartDAO.findAllByUser(user);
    }

    public List<Cart> listByBook(int bookid) {
        Book book = bookService.get(bookid);
        return cartDAO.findAllByBook(book);
    }
}
