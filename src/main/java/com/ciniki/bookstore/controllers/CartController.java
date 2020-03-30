package com.ciniki.bookstore.controllers;

import com.ciniki.bookstore.pojo.Cart;
import com.ciniki.bookstore.services.CartService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CartController {
    @Autowired
    CartService cartService;

    @CrossOrigin
    @GetMapping("/api/carts")
    public List<Cart> list() throws Exception {
        return cartService.list();
    }

    @CrossOrigin
    @GetMapping("/api/{uid}/carts")
    public List<Cart> listByUid(@PathVariable("uid") int uid) throws Exception {
        if(uid != 0) {
            return cartService.listByUser(uid);
        } else {
            return list();
        }
    }

    @CrossOrigin
    @GetMapping("/api/carts/{bookid}")
    public List<Cart> listByBookid(@PathVariable("bookid") int bookid) throws Exception {
        if(bookid != 0) {
            return cartService.listByBook(bookid);
        } else {
            return list();
        }
    }

    @CrossOrigin
    @PostMapping("/api/carts")
    public Cart addOrUpdate(@RequestBody Cart cart) throws Exception {
        cartService.addOrUpdate(cart);
        return cart;
    }
}
