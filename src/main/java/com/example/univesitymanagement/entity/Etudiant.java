package com.example.univesitymanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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

}
