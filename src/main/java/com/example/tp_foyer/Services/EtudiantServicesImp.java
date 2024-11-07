package com.example.tp_foyer.Services;

import com.example.tp_foyer.Entity.Etudiant;
import com.example.tp_foyer.Repositories.EtudiantRepositories;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class EtudiantServicesImp implements IEtudiantServices{
    EtudiantRepositories etudiantRepositories;
    @Override
    public List<Etudiant> findAll() {
        return etudiantRepositories.findAll();
    }

    @Override
    public Etudiant findById(long id) {
        return etudiantRepositories.getReferenceById(id);
    }

    @Override
    public Etudiant createEtudiant(Etudiant etudiant) {
        return etudiantRepositories.save(etudiant);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        return etudiantRepositories.save(etudiant);
    }

    @Override
    public void deleteEtudiant(long id) {
        etudiantRepositories.deleteById(id);
    }
}
