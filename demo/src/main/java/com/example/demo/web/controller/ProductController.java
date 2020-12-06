package com.example.demo.web.controller;

import com.example.demo.model.Product;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    @RequestMapping(value="/products", method = RequestMethod.GET)
    public String listeProduits() {
        return "Vous avez demandé la liste des produits";
    }

    @GetMapping(value="/products/{id}")
    public Product afficherProduit(@PathVariable int id) {
        System.out.println("In afficherProduit with params=" + id);
        Product product = new Product(id, new String("Apsirateur"), 100);
        return product;
    }

}
