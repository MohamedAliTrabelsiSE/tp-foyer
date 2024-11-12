package com.example.tp_foyer.Controller;

import com.example.tp_foyer.Entity.Reservation;
import com.example.tp_foyer.Services.IReservationServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationRestController {
    IReservationServices reservationServices;

    @GetMapping("/retrieveAllReservation")
    public List<Reservation> retrieveAllReservation() {
        List<Reservation> reservations = reservationServices.getAllReservations();
        return reservations;
    }

    @GetMapping("/retrieveReservation/{id}")
    public Reservation retrieveReservationById(@PathVariable("id") long id) {
        return reservationServices.getReservationById(id);
    }

    @PostMapping("/addReservation")
    public Reservation addReservation(@RequestBody Reservation reservation) {
        return reservationServices.CreateReservation(reservation);
    }

    @PutMapping("/updateReservation")
    public Reservation updateReservation(@RequestBody Reservation reservation) {
        return reservationServices.UpdateReservation(reservation);
    }

    @DeleteMapping("/deleteReservation/{id}")
    public void deleteReservationById(@PathVariable("id") long id) {
        reservationServices.DeleteReservation(id);
    }
}
