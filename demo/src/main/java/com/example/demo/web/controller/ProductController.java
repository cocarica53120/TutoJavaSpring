package com.example.demo.web.controller;

import com.example.demo.dao.ProductDaoImpl;
import com.example.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired // Permet à Spring de créer ube instance de ProductDaoImpl
    private ProductDaoImpl productDao;

    // If @Autowired (with private ProductDaoImpl productDao;) as above is not used, instanciates the productDao
    // It works, but not sure that it is the good practice.
//    ProductController() {
//        System.out.println("ctor ProductDaoImpl");
//        productDao = new ProductDaoImpl();
//    }

    @RequestMapping(value="/products", method = RequestMethod.GET)
    public List<Product> listProducts() {
        return productDao.findAll();
    }

    @GetMapping(value="/products/{id}")
    public Product getProduct(@PathVariable int id) {
        return productDao.findById(id);
    }

    @PostMapping(value="/products")
    public void AddProduct(@RequestBody Product product) {
        productDao.save(product);
    }


}
