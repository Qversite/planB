package com.example.demo333.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    @CollectionTable(name = "users_role",joinColumns = @JoinColumn(name = "users_id"))
    @Enumerated(EnumType.STRING)
    @ElementCollection(targetClass = Role.class,fetch = FetchType.EAGER)
    private Set<Role> roles;
}
