package com.cursospringinitializr.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursospringinitializr.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
