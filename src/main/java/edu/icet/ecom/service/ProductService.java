package edu.icet.ecom.service;

import edu.icet.ecom.dto.Product;

import java.util.List;

public interface ProductService {

    boolean save(Product product);

    boolean update(Product product);

    List<Product> getAll();

    Product search(Integer id);

    boolean delete(Integer id);
}
