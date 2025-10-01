package com.abhirampjayan.storemvn.entities;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Entity
@AllArgsConstructor
@Table(name = "users")
@Builder
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(nullable = false, name = "name")
    private String name;

    @Column(nullable = false, name = "email")
    private String email;

    @Column(nullable = false, name = "password")
    private String password;

}
