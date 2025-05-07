package com.devgustavodaniel.gestaodefreelancer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
public class Customer extends Usuario{

    @OneToMany
    List<Projects> myProjects;


}
