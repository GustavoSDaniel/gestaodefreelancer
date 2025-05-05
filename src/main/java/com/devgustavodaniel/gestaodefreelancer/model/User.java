package com.devgustavodaniel.gestaodefreelancer.model;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String name;
    private String cpfOrcnpj;
    private String email;
    private String password;

    public User() {
    }

    public User(Long userId, String name, String cpfOrcnpj, String email, String password) {
        this.userId = userId;
        this.name = name;
        this.cpfOrcnpj = cpfOrcnpj;
        this.email = email;
        this.password = password;
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
}
