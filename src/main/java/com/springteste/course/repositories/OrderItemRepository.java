package com.springteste.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springteste.course.entities.OrderItem;
import com.springteste.course.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{ 

}
