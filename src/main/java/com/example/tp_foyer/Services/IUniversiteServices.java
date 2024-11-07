package com.example.tp_foyer.Services;

import com.example.tp_foyer.Entity.Universite;

import java.util.List;

public interface IUniversiteServices {
    List<Universite> findAll();
    Universite findById(long id);
    Universite createUniversite(Universite universite);
    Universite updateUniversite(Universite universite);
    void deleteUniversite(long id);
}
