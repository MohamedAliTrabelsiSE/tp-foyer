package com.example.tp_foyer.Services;

import com.example.tp_foyer.Entity.Foyer;
import com.example.tp_foyer.Repositories.FoyerRepositories;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class FoyerServicesImp implements IFoyerServices{
    FoyerRepositories foyerRepositories;
    @Override
    public List<Foyer> findAll() {
        return foyerRepositories.findAll();
    }

    @Override
    public Foyer findById(long id) {
        return foyerRepositories.findById(id).get();
    }

    @Override
    public Foyer createFoyer(Foyer foyer) {
        return foyerRepositories.save(foyer);
    }

    @Override
    public Foyer updateFoyer(Foyer foyer) {
        return foyerRepositories.save(foyer);
    }

    @Override
    public void deleteFoyer(long id) {
        foyerRepositories.deleteById(id);

    }
}
