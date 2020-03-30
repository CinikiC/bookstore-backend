package com.ciniki.bookstore.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "CATEGORY")
@JsonIgnoreProperties({
        "handler",
        "hibernateLazyInitializer"
})

public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cid")
    int cid;

    String cname;

    public int getCid() {
        return cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
