package com.example.tp_foyer.Services;

import com.example.tp_foyer.Entity.Chambre;

import java.util.List;

public interface IChambreServices  {
    List<Chambre> getChambres();
    Chambre getChambreById(long id);
    Chambre addChambre(Chambre chambre);
    Chambre updateChambre(Chambre chambre);
    void deleteChambre(long id);


}
