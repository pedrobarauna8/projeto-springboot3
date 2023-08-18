package com.pedrobarauna.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrobarauna.course.entities.OrderItem;
import com.pedrobarauna.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
