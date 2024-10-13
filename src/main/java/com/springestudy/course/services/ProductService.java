package com.springestudy.course.services;

import com.springestudy.course.entites.Category;
import com.springestudy.course.entites.Product;
import com.springestudy.course.repositories.CategoryRepository;
import com.springestudy.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product findbyId(Long id){
        Optional<Product> obj = productRepository.findById(id);
        return obj.get();
    }
}
