package com.proaula.proyectoAula.entity;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
public class Task {
    enum Status {
        Completed, Incompleted, InProgress
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taskId;
    private String description;
    private LocalDate deadline;
    private Status status;
    private LocalDate fecha;

    @ManyToOne
    private Contract contract;

    // CONSTRUCTORS
    public Task() {
    }

    public Task(Long taskId, String description, LocalDate deadline, Status status, LocalDate fecha,
            Contract contract) {
        this.taskId = taskId;
        this.description = description;
        this.deadline = deadline;
        this.status = status;
        this.fecha = fecha;
        this.contract = contract;
    }

    // GETTERS AND SETTERS
    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }
}
