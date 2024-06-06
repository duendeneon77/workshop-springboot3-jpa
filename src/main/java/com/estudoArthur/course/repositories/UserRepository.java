package com.estudoArthur.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudoArthur.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
