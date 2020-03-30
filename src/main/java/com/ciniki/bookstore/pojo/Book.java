package com.ciniki.bookstore.pojo;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "BOOK")
@JsonIgnoreProperties({
        "handler",
        "hibernateLazyInitializer"
})
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "cid")
    private Category category;

    String cover;
    String title;
    String author;
    String publishdate;
    String press;
    String abs;
    int price;

    public Category getCategory() {
        return category;
    }

    public int getId() {
        return id;
    }

    public String getAbs() {
        return abs;
    };

    public int getPrice() {
        return price;
    }

    public String getCover() {
        return cover;
    }

    public String getAuthor() {
        return author;
    }

    public String getPress() {
        return press;
    }

    public String getPublishdate() {
        return publishdate;
    }

    public String getTitle() {
        return title;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAbs(String abs) {
        this.abs = abs;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public void setPublishdate(String publishdate) {
        this.publishdate = publishdate;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
