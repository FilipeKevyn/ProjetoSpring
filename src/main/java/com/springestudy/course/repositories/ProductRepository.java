package com.springestudy.course.repositories;

import com.springestudy.course.entites.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
