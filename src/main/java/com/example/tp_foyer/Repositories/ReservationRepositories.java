package com.example.tp_foyer.Repositories;

import com.example.tp_foyer.Entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepositories extends JpaRepository<Reservation, Long> {
}
