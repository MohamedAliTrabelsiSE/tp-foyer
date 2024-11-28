package com.example.tp_foyer.Repositories;

import com.example.tp_foyer.Entity.Chambre;
import com.example.tp_foyer.Entity.TypeChambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChambreRepositories extends JpaRepository<Chambre, Long> {

    List<Chambre> findByTypeChambre(TypeChambre typeChambre);
    List<Chambre> findChambreByTypeChambreAndBloc_IdBloc(TypeChambre typeChambre, Long idBloc);
    List<Chambre> findAllChambreByReservationsIsEmpty();


}
