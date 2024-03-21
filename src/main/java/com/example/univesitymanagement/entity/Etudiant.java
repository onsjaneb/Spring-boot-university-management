package com.example.univesitymanagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="etudiant")
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String cin;
    private Date date_nais;
    private String lieu_nais;
    private int tel;
    private String genre;
    private String nationalite;
    private String specialite;
    private String diplome;
    private String situation;
    @Column(nullable = false,unique = true)
    private String email;
    private String password;
}
