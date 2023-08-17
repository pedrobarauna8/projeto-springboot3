package com.pedrobarauna.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrobarauna.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
