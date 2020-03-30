package com.ciniki.bookstore.services;

import com.ciniki.bookstore.DAO.CategoryDAO;
import com.ciniki.bookstore.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryDAO categoryDAO;

    public List<Category> list() {
        //Sort sort = new Sort(Sort.Direction.DESC, "cid");
        return categoryDAO.findAll(Sort.by(Sort.Direction.DESC, "cid"));
    }

    public Category get(int cid) {
        Category category = categoryDAO.findById(cid).orElse(null);
        return category;
    }
}
