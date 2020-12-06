package com.example.demo.dao;

import com.example.demo.model.Product;

import java.util.List;

// For name of methods, see conventions (Spring Data JPA) at
//      https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods
public interface ProductDao {
    public List<Product> findAll();
    public Product findById(int id);
    public Product save(Product product);
}
