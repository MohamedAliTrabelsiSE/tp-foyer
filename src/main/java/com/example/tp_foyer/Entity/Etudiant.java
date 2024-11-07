package com.example.tp_foyer.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.Set;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Etudiant_Table")
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idEtudiant;
    String nomEtudiant;
    String prenomEtudiant;
    Long cinEtudiant;
    String ecole;
    Date dateNaissance;
    @ManyToMany(mappedBy = "etudiants")
    @JsonIgnore
    @ToString.Exclude
    Set<Reservation> reservations;
}
