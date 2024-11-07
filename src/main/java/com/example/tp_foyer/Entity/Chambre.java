package com.example.tp_foyer.Entity;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "chambre_Table")
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idChambre;
    Long numberChambre;
    @Enumerated(EnumType.STRING)
    TypeChambre typeC;
    @OneToMany
    @JsonIgnore
    @ToString.Exclude
    Set<Reservation> reservations;
    @ManyToOne
    Bloc bloc;


}
