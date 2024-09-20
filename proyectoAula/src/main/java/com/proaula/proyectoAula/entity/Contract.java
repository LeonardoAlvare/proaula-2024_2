package com.proaula.proyectoAula.entity;

import java.time.LocalDate;
import java.util.*;
import jakarta.persistence.*;

@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contractId;
    private double price;
    private String duration;
    private List<String> requirements;
    private LocalDate startDate;
    private LocalDate endDate;

    @OneToMany
    private List<Task> tasks;

    @OneToOne
    private Transaction transaction;

    // CONSTRUCTORS
    public Contract() {
    }

    public Contract(Long contractId, double price, String duration, List<String> requirements, LocalDate startDate,
            LocalDate endDate, List<Task> tasks, Transaction transaction) {
        this.contractId = contractId;
        this.price = price;
        this.duration = duration;
        this.requirements = requirements;
        this.startDate = startDate;
        this.endDate = endDate;
        this.tasks = tasks;
        this.transaction = transaction;
    }

    // GETTERS AND SETTERS
    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }
    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public List<String> getRequirements() {
        return requirements;
    }

    public void setRequirements(List<String> requirements) {
        this.requirements = requirements;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }
}
