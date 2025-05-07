package com.devgustavodaniel.gestaodefreelancer.model;

import com.devgustavodaniel.gestaodefreelancer.enums.ProfileType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
public class Freelancer extends Usuario{

    @OneToMany
    private List<Projects> workingOntheproject;

    public Freelancer(List<Projects> workingOntheproject) {
        this.workingOntheproject = workingOntheproject;
    }

    public Freelancer(String name, String cpfOrcnpj, String email, String password, ProfileType mainProfileType, ProfileType secondProfileType, List<Projects> workingOntheproject) {
        super(name, cpfOrcnpj, email, password, mainProfileType, secondProfileType);
        this.workingOntheproject = workingOntheproject;
    }

    public List<Projects> getWorkingOntheproject() {
        return workingOntheproject;
    }

    public void setWorkingOntheproject(List<Projects> workingOntheproject) {
        this.workingOntheproject = workingOntheproject;
    }
}
