package com.project.finControl.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name = "tb_users")
@Data
@ToString(exclude = "trasactions")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name", nullable = false, length = 100)
    private String name;
    @Column(name = "email", unique = true)
    private String email;
    @Column(name = "senha")
    private String password;
    @OneToMany(mappedBy = "users", fetch = FetchType.LAZY)
    private List<Transaction> transactions;
}
