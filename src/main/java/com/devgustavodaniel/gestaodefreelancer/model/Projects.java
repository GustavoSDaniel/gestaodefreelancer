package com.devgustavodaniel.gestaodefreelancer.model;

import com.devgustavodaniel.gestaodefreelancer.enums.ProjectStatus;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "projects")
public class Projects {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long projectsId;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String descrition;
    @Column(nullable = false)
    private LocalDate deadline;
    @Column(nullable = false)
    private Double budget;
    @Enumerated(EnumType.STRING)
    private ProjectStatus projectStatus;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;


    public Projects() {
    }

    public Projects(String title, String descrition, LocalDate deadline, Double budget, ProjectStatus projectStatus, Customer customer) {
        this.title = title;
        this.descrition = descrition;
        this.deadline = deadline;
        this.budget = budget;
        this.projectStatus = projectStatus;
        this.customer = customer;
    }

    public Long getProjectsId() {
        return projectsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescrition() {
        return descrition;
    }

    public void setDescrition(String descrition) {
        this.descrition = descrition;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public ProjectStatus getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(ProjectStatus projectStatus) {
        this.projectStatus = projectStatus;
    }

    public Customer getCustomer() {
        return customer;
    }

}
