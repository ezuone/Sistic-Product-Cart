package com.sistic;

import org.springframework.data.jpa.repository.JpaRepository;

//Specify the domain entity class
public interface ProductRepository extends JpaRepository<Product, Long>{

	
}
