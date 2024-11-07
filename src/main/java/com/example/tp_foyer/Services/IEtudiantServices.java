package com.example.tp_foyer.Services;

import com.example.tp_foyer.Entity.Etudiant;

import java.util.List;

public interface IEtudiantServices {
    List<Etudiant> findAll();
    Etudiant findById(long id);
    Etudiant createEtudiant(Etudiant etudiant);
    Etudiant updateEtudiant(Etudiant etudiant);
    void deleteEtudiant(long id);
}
