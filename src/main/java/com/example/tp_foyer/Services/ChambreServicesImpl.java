package com.example.tp_foyer.Services;

import com.example.tp_foyer.Entity.Chambre;
import com.example.tp_foyer.Repositories.ChambreRepositories;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ChambreServicesImpl implements IChambreServices{

    ChambreRepositories chambreRepositories;

    @Override
    public List<Chambre> getChambres() {
        return chambreRepositories.findAll();
    }

    @Override
    public Chambre getChambreById(long id) {
        return chambreRepositories.findById(id).get();
    }

    @Override
    public Chambre addChambre(Chambre chambre) {
        return chambreRepositories.save(chambre);
    }

    @Override
    public Chambre updateChambre(Chambre chambre) {
        return chambreRepositories.save(chambre);
    }

    @Override
    public void deleteChambre(long id) {
        chambreRepositories.deleteById(id);

    }
}
