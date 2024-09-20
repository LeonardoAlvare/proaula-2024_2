package com.proaula.proyectoAula.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Project {
    enum Status {
        Available, Busy
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long projectId;
    private String title;
    private String description;
    private Status status;
    private LocalDate deadline;
    private double budget;
    private List<String> skillsRequired;
 
    @ManyToOne
    private Client client;

    @OneToMany
    private List<Proposal> proposals;

    // CONSTRUCTORS
    public Project() {
    }

    public Project(Long projectId, String title, String description, Status status, LocalDate deadline, double budget,
            List<String> skillsRequired, Client client, List<Proposal> proposals) {
        this.projectId = projectId;
        this.title = title;
        this.description = description;
        this.status = status;
        this.deadline = deadline;
        this.budget = budget;
        this.skillsRequired = skillsRequired;
        this.client = client;
        this.proposals = proposals;
    }

    // GETTERS AND SETTERS
    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public List<String> getSkillsRequired() {
        return skillsRequired;
    }

    public void setSkillsRequired(List<String> skillsRequired) {
        this.skillsRequired = skillsRequired;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Proposal> getProposals() {
        return proposals;
    }

    public void setProposals(List<Proposal> proposals) {
        this.proposals = proposals;
    }
}
