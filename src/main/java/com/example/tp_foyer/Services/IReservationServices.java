package com.example.tp_foyer.Services;

import com.example.tp_foyer.Entity.Reservation;

import java.util.List;

public interface IReservationServices {
    List<Reservation> getAllReservations();
    Reservation getReservationById(long id);
    Reservation CreateReservation(Reservation reservation);
    Reservation UpdateReservation(Reservation reservation);
    void DeleteReservation(long id);

}
