package com.proaula.proyectoAula.entity;

import jakarta.persistence.*;

@Entity
public class User {
    enum Role {
        Client, Freelancer
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long user_id;
    private String name;
    private String email;
    private String password;
    private String profilePicture;
    private Role role;

    @OneToOne
    private Client client;

    @OneToOne
    private Freelancer freelancer;

    // CONSTRUCTORS
    public User() {
    }

    public User(Long user_id, String name, String email, String password, String profilePicture, Role role,
            Client client, Freelancer freelancer) {
        this.user_id = user_id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.profilePicture = profilePicture;
        this.role = role;
        this.client = client;
        this.freelancer = freelancer;
    }

    // GETTERS AND SETTERS
    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Freelancer getFreelancer() {
        return freelancer;
    }

    public void setFreelancer(Freelancer freelancer) {
        this.freelancer = freelancer;
    }
}
