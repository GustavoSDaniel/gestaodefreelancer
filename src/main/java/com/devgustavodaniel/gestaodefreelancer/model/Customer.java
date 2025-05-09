package com.devgustavodaniel.gestaodefreelancer.model;

import com.devgustavodaniel.gestaodefreelancer.model.enums.ProfileType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "customer")
public class Customer extends Usuario{

    public Customer() {}



    @OneToMany
    List<Project> myProjects;

    public Customer(List<Project> myProjects) {
        this.myProjects = myProjects;
    }

    public Customer(String name, String cpfOrcnpj, String email, String password, ProfileType mainProfileType, ProfileType secondProfileType, List<Project> myProjects) {
        super(name, cpfOrcnpj, email, password, mainProfileType, secondProfileType);
        this.myProjects = myProjects;
    }

    public List<Project> getMyProjects() {
        return myProjects;
    }

    public void setMyProjects(List<Project> myProjects) {
        this.myProjects = myProjects;
    }
}
