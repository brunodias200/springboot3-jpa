package com.cursospringinitializr.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursospringinitializr.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
