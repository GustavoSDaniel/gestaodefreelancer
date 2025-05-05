package com.devgustavodaniel.gestaodefreelancer.model;

import com.devgustavodaniel.gestaodefreelancer.enums.ProfileType;
import jakarta.persistence.*;

@Entity
@Table(name = "user")
public  class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String cpfOrcnpj;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ProfileType mainProfileType;

    @Enumerated(EnumType.STRING)
    private ProfileType secondProfileType;

    public User() {
    }

    public User(String name, String cpfOrcnpj, String email, String password, ProfileType mainProfileType, ProfileType secondProfileType) {
        this.name = name;
        this.cpfOrcnpj = cpfOrcnpj;
        this.email = email;
        this.password = password;
        this.mainProfileType = mainProfileType;
        this.secondProfileType = secondProfileType;
    }

    public Long getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpfOrcnpj() {
        return cpfOrcnpj;
    }

    public void setCpfOrcnpj(String cpfOrcnpj) {
        this.cpfOrcnpj = cpfOrcnpj;
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

    public ProfileType getMainProfileType() {
        return mainProfileType;
    }

    public void setMainProfileType(ProfileType mainProfileType) {
        this.mainProfileType = mainProfileType;
    }

    public ProfileType getSecondProfileType() {
        return secondProfileType;
    }

    public void setSecondProfileType(ProfileType secondProfileType) {
        this.secondProfileType = secondProfileType;
    }
}
