package com.proaula.proyectoAula.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proaula.proyectoAula.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{

}
