package com.example.tp_foyer.Services;

import com.example.tp_foyer.Entity.Universite;
import com.example.tp_foyer.Repositories.UniversiteRepositories;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class UniversiteServicesImp implements IUniversiteServices {

    UniversiteRepositories universiteRepositories;
    @Override
    public List<Universite> findAll() {
        return universiteRepositories.findAll();
    }

    @Override
    public Universite findById(long id) {
        return universiteRepositories.findById(id).get();
    }


    @Override
    public Universite createUniversite(Universite universite) {
        return universiteRepositories.save(universite);
    }

    @Override
    public Universite updateUniversite(Universite universite) {
        return universiteRepositories.save(universite);
    }

    @Override
    public void deleteUniversite(long id) {
        universiteRepositories.deleteById(id);
    }

}
