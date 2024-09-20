package com.proaula.proyectoAula.entity;

import java.util.List;
import jakarta.persistence.*;

@Entity
public class Freelancer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long freelancer_id;
    private int rating;
    private List<String> skills;
    private int hourly_rate;
    private String biography;
    private String protafolio_url;

    @OneToOne
    private User user;

    @OneToMany
    private List<Proposal> proposals;

    // CONSTRUCTORS
    public Freelancer() {
    }

    public Freelancer(Long freelancer_id, int rating, List<String> skills, int hourly_rate, String biography,
            String protafolio_url, User user, List<Proposal> proposals) {
        this.freelancer_id = freelancer_id;
        this.rating = rating;
        this.skills = skills;
        this.hourly_rate = hourly_rate;
        this.biography = biography;
        this.protafolio_url = protafolio_url;
        this.user = user;
        this.proposals = proposals;
    }

    // GETTERS AND SETTERS
    public Long getFreelancer_id() {
        return freelancer_id;
    }

    public void setFreelancer_id(Long freelancer_id) {
        this.freelancer_id = freelancer_id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public int getHourly_rate() {
        return hourly_rate;
    }

    public void setHourly_rate(int hourly_rate) {
        this.hourly_rate = hourly_rate;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public String getProtafolio_url() {
        return protafolio_url;
    }

    public void setProtafolio_url(String protafolio_url) {
        this.protafolio_url = protafolio_url;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Proposal> getProposals() {
        return proposals;
    }

    public void setProposals(List<Proposal> proposals) {
        this.proposals = proposals;
    }
}
