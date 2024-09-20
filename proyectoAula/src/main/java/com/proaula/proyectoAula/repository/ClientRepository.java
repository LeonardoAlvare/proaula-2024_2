package com.proaula.proyectoAula.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proaula.proyectoAula.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
