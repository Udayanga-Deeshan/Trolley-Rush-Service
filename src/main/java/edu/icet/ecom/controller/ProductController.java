package edu.icet.ecom.controller;

import edu.icet.ecom.dto.Product;
import edu.icet.ecom.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
@CrossOrigin
public class ProductController {

    final ProductService productService;
    @PostMapping("/create")
    public ResponseEntity<String> createProduct(@RequestBody Product product){
        boolean isSaved = productService.save(product);
        return isSaved ? ResponseEntity.status(HttpStatus.CREATED).body("Product Created successfully") : ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to save the product");


    }

    @PutMapping("/update")
    public  ResponseEntity<String>  updateProduct(@RequestBody Product product){
        boolean isUpdated = productService.update(product);
        return isUpdated ? ResponseEntity.status(HttpStatus.OK).body("Product Update successfully"):ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product not found or failed to update");
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllProducts(){
        List<Product> productList = productService.getAll();
        return  productList !=null && productList.isEmpty() ? ResponseEntity.ok(productList):ResponseEntity.status(HttpStatus.NO_CONTENT).body("No Products Found");
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> searchProduct(@PathVariable Integer id){
        Product searchedProduct = productService.search(id);
        return  searchedProduct !=null ? ResponseEntity.ok(searchedProduct):ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product Not Found");
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteProduct(Integer id){
        boolean isDeleted = productService.delete(id);
        return  isDeleted ? ResponseEntity.status(HttpStatus.NO_CONTENT).build(): ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product Not Found");
    }
}
