package com.example.tp_foyer.Repositories;

import com.example.tp_foyer.Entity.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlocRepositories extends JpaRepository<Bloc, Long> {
}
