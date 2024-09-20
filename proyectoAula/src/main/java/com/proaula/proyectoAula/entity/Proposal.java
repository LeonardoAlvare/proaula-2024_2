package com.proaula.proyectoAula.entity;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
public class Proposal {
    enum Status {
        Accepted, Failed
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long proposalId;
    private double bidAmount;
    private String proposalText;
    private Status status;
    private LocalDate createdAt;
    private String timeEstimate;

    @ManyToOne
    private Freelancer freelancer;

    @ManyToOne
    private Project project;

    // CONSTRUCTORS
    public Proposal() {
    }

    public Proposal(Long proposalId, double bidAmount, String proposalText, Status status, LocalDate createdAt,
            String timeEstimate, Freelancer freelancer, Project project) {
        this.proposalId = proposalId;
        this.bidAmount = bidAmount;
        this.proposalText = proposalText;
        this.status = status;
        this.createdAt = createdAt;
        this.timeEstimate = timeEstimate;
        this.freelancer = freelancer;
        this.project = project;
    }

    // GETTERS AND SETTERS
    public Long getProposalId() {
        return proposalId;
    }

    public void setProposalId(Long proposalId) {
        this.proposalId = proposalId;
    }

    public double getBidAmount() {
        return bidAmount;
    }

    public void setBidAmount(double bidAmount) {
        this.bidAmount = bidAmount;
    }

    public String getProposalText() {
        return proposalText;
    }

    public void setProposalText(String proposalText) {
        this.proposalText = proposalText;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public String getTimeEstimate() {
        return timeEstimate;
    }

    public void setTimeEstimate(String timeEstimate) {
        this.timeEstimate = timeEstimate;
    }

    public Freelancer getFreelancer() {
        return freelancer;
    }

    public void setFreelancer(Freelancer freelancer) {
        this.freelancer = freelancer;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
