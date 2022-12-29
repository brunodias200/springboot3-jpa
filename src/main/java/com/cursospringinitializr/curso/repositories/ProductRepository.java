package com.cursospringinitializr.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursospringinitializr.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
