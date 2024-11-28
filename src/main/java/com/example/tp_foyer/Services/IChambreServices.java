package com.example.tp_foyer.Services;

import com.example.tp_foyer.Entity.Chambre;
import com.example.tp_foyer.Entity.TypeChambre;

import java.util.List;

public interface IChambreServices  {
    List<Chambre> getChambres();
    Chambre getChambreById(long id);
    Chambre addChambre(Chambre chambre);
    Chambre updateChambre(Chambre chambre);
    void deleteChambre(long id);
    public List<Chambre> retrieveChambreByType(TypeChambre typeChambre);
    public List<Chambre> retrieveChambreByTypeAndBlocId(TypeChambre typeChambre, long blocId);


}
