package edu.icet.ecom.controller;

import edu.icet.ecom.dto.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @PostMapping("/create")
    public void createProduct(Product product){

    }
}
