package com.example.univesitymanagement.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EtudiantDto {
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
    private String email;
    private String password;
}
