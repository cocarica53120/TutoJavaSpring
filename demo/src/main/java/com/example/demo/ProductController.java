package com.example.demo;

import org.springframework.web.bind.annotation.*;

class Product {

    Product() {
        System.out.println("ctor " + Product.class);
    }

}

@RestController
public class ProductController {
    @RequestMapping(value="/products", method = RequestMethod.GET)
    public String listeProduits() {
        return new Product().toString();
    }

    @GetMapping(value="/products/{id}")
    public String afficherProduit(@PathVariable int id) {
        System.out.println("In afficherProduit with params=" + id);
        return "Vous avez demandé un produit avec l'id = " + id;
    }

}
