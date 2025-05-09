package com.devgustavodaniel.gestaodefreelancer.model;

import com.devgustavodaniel.gestaodefreelancer.model.enums.ProfileType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "freelancer")
public class Freelancer extends Usuario{

    public Freelancer() {}

    @OneToMany
    private List<Project> workingOntheproject;

    public Freelancer(List<Project> workingOntheproject) {
        this.workingOntheproject = workingOntheproject;
    }

    public Freelancer(String name, String cpfOrcnpj, String email, String password, ProfileType mainProfileType, ProfileType secondProfileType, List<Project> workingOntheproject) {
        super(name, cpfOrcnpj, email, password, mainProfileType, secondProfileType);
        this.workingOntheproject = workingOntheproject;
    }

    public List<Project> getWorkingOntheproject() {
        return workingOntheproject;
    }

    public void setWorkingOntheproject(List<Project> workingOntheproject) {
        this.workingOntheproject = workingOntheproject;
    }
}
