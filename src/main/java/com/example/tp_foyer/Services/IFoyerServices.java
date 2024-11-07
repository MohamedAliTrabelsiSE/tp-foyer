package com.example.tp_foyer.Services;

import com.example.tp_foyer.Entity.Foyer;

import java.util.List;

public interface IFoyerServices {
    List<Foyer> findAll();
    Foyer findById(long id);
    Foyer createFoyer(Foyer foyer);
    Foyer updateFoyer(Foyer foyer);
    void deleteFoyer(long id);

}
