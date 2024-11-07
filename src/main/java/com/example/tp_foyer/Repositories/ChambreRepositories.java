package com.example.tp_foyer.Repositories;

import com.example.tp_foyer.Entity.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChambreRepositories extends JpaRepository<Chambre, Long> {


}
