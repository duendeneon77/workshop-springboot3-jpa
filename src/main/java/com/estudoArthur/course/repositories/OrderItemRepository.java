package com.estudoArthur.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudoArthur.course.entities.OrderItem;
import com.estudoArthur.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
	
	

}
