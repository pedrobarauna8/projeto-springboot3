package com.pedrobarauna.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrobarauna.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
