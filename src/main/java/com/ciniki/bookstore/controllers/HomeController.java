package com.ciniki.bookstore.controllers;

import com.ciniki.bookstore.pojo.Book;
import com.ciniki.bookstore.services.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {
    @Autowired
    BookService bookService;

    @CrossOrigin
    @GetMapping("/api/books")
    public List<Book> list() throws Exception {
        return bookService.list();
    }

    @CrossOrigin
    @GetMapping("/api/categories/{cid}/books")
    public List<Book> listByCategory(@PathVariable("cid") int cid) throws Exception {
        if(cid != 0) {
            return bookService.listByCategory(cid);
        } else {
            return list();
        }
    }

    @CrossOrigin
    @GetMapping("/api/search")
    public List<Book> listByTitleLikeOrAuthorLike(@RequestParam("keywords") String keywords) throws Exception {
        if(keywords != "") {
            return bookService.listByTitleLikeOrAuthorLike(keywords);
        } else {
            return list();
        }
    }

    @CrossOrigin
    @PostMapping("/api/books")
    public Book addOrUpdate(@RequestBody Book book) throws Exception {
        bookService.addOrUpdate(book);
        return book;
    }

    @CrossOrigin
    @PostMapping("/api/delete")
    public void deleteBook(@RequestBody Book book) throws Exception {
        bookService.deleteById(book.getId());
    }
}
