package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.Product;
import edu.icet.ecom.entity.ProductEntity;
import edu.icet.ecom.repository.ProductRepository;
import edu.icet.ecom.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    private  final ModelMapper mapper;


    @Override
    public boolean save(Product product) {
        if(product !=null){
            productRepository.save(mapper.map(product, ProductEntity.class));
        }

        return false;
    }

    @Override
    public boolean update(Product product) {
        if(product !=null){
            productRepository.save(mapper.map(product, ProductEntity.class));
        }

        return false;
    }

    @Override
    public List<Product> getAll() {
        return  productRepository.findAll().stream().map(productEntity -> mapper.map(productEntity,Product.class))
                .collect(Collectors.toList());
    }

    @Override
    public Product search(Integer id) {
        if (id != null) {
            mapper.map(productRepository.findById(id), Product.class);
        }
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        if (id != null) {
            productRepository.deleteById(id);

        }
        return false;
    }
}
