package com.proaula.proyectoAula.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proaula.proyectoAula.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
