package com.estudoArthur.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudoArthur.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	

}
