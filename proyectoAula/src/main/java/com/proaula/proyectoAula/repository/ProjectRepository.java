package com.proaula.proyectoAula.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proaula.proyectoAula.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Long>{

}
