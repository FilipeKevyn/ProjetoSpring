package com.springestudy.course.repositories;

import com.springestudy.course.entites.Category;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
