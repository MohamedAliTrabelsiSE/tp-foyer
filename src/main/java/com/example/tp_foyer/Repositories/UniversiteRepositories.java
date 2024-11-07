package com.example.tp_foyer.Repositories;

import com.example.tp_foyer.Entity.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversiteRepositories extends JpaRepository<Universite, Long> {
}
