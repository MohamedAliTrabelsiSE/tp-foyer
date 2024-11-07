package com.example.tp_foyer.Repositories;

import com.example.tp_foyer.Entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantRepositories extends JpaRepository<Etudiant, Long> {
}
