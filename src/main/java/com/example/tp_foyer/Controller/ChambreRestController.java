package com.example.tp_foyer.Controller;

import com.example.tp_foyer.Entity.Chambre;
import com.example.tp_foyer.Entity.TypeChambre;
import com.example.tp_foyer.Services.IChambreServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/chambre")
public class ChambreRestController {
    IChambreServices chambreServices;

    @GetMapping("/retrieveAllChambre")
    public List<Chambre> retrieveAllChambre(){
        List<Chambre> chambres = chambreServices.getChambres();
        return chambres;
    }
    @GetMapping("/retrieveChambre/{id}")
    public Chambre retrieveChambreById(@PathVariable("id") long id){
        return chambreServices.getChambreById(id);
    }
    @PostMapping("/addChambre")
    public Chambre addChambre(@RequestBody Chambre chambre){
        return chambreServices.addChambre(chambre);
    }
    @PutMapping("/updateChambre")
    public Chambre updateChambre(@RequestBody Chambre chambre){
        return chambreServices.updateChambre(chambre);
    }
    @DeleteMapping("/deleteChambre/{id}")
    public void deleteChambreById(@PathVariable("id") long id){
        chambreServices.deleteChambre(id);
    }
    @GetMapping("/retrieveChambreByType/{tc}")
    public List<Chambre> retrieveChambreByType(@PathVariable("tc") TypeChambre typeChambre){
        return chambreServices.retrieveChambreByType(typeChambre);
    }
}
