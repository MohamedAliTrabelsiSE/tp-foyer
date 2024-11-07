package com.example.tp_foyer.Repositories;

import com.example.tp_foyer.Entity.Foyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoyerRepositories extends JpaRepository<Foyer, Long> {
}
