package com.devgustavodaniel.gestaodefreelancer.model;

import com.devgustavodaniel.gestaodefreelancer.enums.ProfileType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
public class Customer extends Usuario{

    @OneToMany
    List<Projects> myProjects;

    public Customer(List<Projects> myProjects) {
        this.myProjects = myProjects;
    }

    public Customer(String name, String cpfOrcnpj, String email, String password, ProfileType mainProfileType, ProfileType secondProfileType, List<Projects> myProjects) {
        super(name, cpfOrcnpj, email, password, mainProfileType, secondProfileType);
        this.myProjects = myProjects;
    }

    public List<Projects> getMyProjects() {
        return myProjects;
    }

    public void setMyProjects(List<Projects> myProjects) {
        this.myProjects = myProjects;
    }
}
