package com.springestudy.course.services;

import java.util.List;
import java.util.Optional;

import com.springestudy.course.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springestudy.course.entites.Category;
import com.springestudy.course.repositories.CategoryRepository;
@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;
    public List<Category> findAll() {
        return repository.findAll();
    }
    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
