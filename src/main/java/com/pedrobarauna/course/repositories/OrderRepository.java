package com.pedrobarauna.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrobarauna.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
