package com.ciniki.bookstore.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ciniki.bookstore.pojo.Category;

public interface CategoryDAO extends JpaRepository<Category, Integer>{
}
