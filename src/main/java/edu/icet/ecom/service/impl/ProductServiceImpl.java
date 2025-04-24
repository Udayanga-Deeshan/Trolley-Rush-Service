package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.Product;
import edu.icet.ecom.service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    @Override
    public boolean save(Product product) {
        return false;
    }

    @Override
    public boolean update(Product product) {
        return false;
    }

    @Override
    public List<Product> getAll() {
        return List.of();
    }

    @Override
    public Product search(Integer id) {
        return null;
    }
}
