package com.ciniki.bookstore.pojo;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "CART")
@JsonIgnoreProperties({
        "handler",
        "hibernateLazyInitializer"
})

public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cartid")
    int cartid;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "bookid")
    private Book book;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "uid")
    private User user;

    int number;
    int price;

    public int getCartid() {
        return cartid;
    }

    public int getNumber() {
        return number;
    }

    public int getPrice() {
        return price;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public Book getBook() {
        return book;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCartid(int cartid) {
        this.cartid = cartid;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
