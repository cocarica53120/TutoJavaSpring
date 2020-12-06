package com.example.demo.dao;

import com.example.demo.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDao {
    // Simulation database

    public static List<Product> products = new ArrayList<>();
    static {
        products.add(new Product(1, new String("Ordi"), 200));
        products.add(new Product(2, new String("Aspi"), 100));
        products.add(new Product(3, new String("Table"), 300));
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Product findById(int id) {
        for (Product product: products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public Product save(Product product) {
        products.add(product);
        return product;
    }
}
