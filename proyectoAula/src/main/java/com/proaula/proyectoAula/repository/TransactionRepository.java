package com.proaula.proyectoAula.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proaula.proyectoAula.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{

}
