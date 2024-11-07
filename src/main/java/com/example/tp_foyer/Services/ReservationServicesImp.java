package com.example.tp_foyer.Services;

import com.example.tp_foyer.Entity.Reservation;
import com.example.tp_foyer.Repositories.ReservationRepositories;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ReservationServicesImp implements IReservationServices{

    ReservationRepositories reservationRepositories;
    @Override
    public List<Reservation> getAllReservations() {
        return reservationRepositories.findAll();
    }

    @Override
    public Reservation getReservationById(long id) {
        return reservationRepositories.getById(id);
    }

    @Override
    public Reservation CreateReservation(Reservation reservation) {
        return reservationRepositories.save(reservation);
    }

    @Override
    public Reservation UpdateReservation(Reservation reservation) {
        return reservationRepositories.save(reservation);
    }

    @Override
    public void DeleteReservation(long id) {
        reservationRepositories.deleteById(id);

    }

}
