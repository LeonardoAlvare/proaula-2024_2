package com.proaula.proyectoAula.entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long client_id;
    private int projects_posted;
    private String company_name;

    @OneToOne
    private User user;

    @OneToMany
    private List<Project> projects;

    // CONSTRUCTORS
    public Client() {
    }

    public Client(Long client_id, int projects_posted, String company_name, User user, List<Project> projects) {
        this.client_id = client_id;
        this.projects_posted = projects_posted;
        this.company_name = company_name;
        this.user = user;
        this.projects = projects;
    }

    // GETTERS AND SETTERS
    public Long getClient_id() {
        return client_id;
    }

    public void setClient_id(Long client_id) {
        this.client_id = client_id;
    }

    public int getProjects_posted() {
        return projects_posted;
    }

    public void setProjects_posted(int projects_posted) {
        this.projects_posted = projects_posted;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}
