package com.cursospringinitializr.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursospringinitializr.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
