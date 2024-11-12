package com.example.tp_foyer.Controller;

import com.example.tp_foyer.Entity.Foyer;
import com.example.tp_foyer.Services.IFoyerServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/foyer")
public class FoyerRestController {
    IFoyerServices foyerServices;

    @GetMapping("/retrieveAllFoyer")
    public List<Foyer> retrieveAllFoyer() {
        List<Foyer> foyers = foyerServices.findAll();
        return foyers;
    }

    @GetMapping("/retrieveFoyer/{id}")
    public Foyer retrieveFoyerById(@PathVariable("id") long id) {
        return foyerServices.findById(id);
    }

    @PostMapping("/addFoyer")
    public Foyer addFoyer(@RequestBody Foyer foyer) {
        return foyerServices.createFoyer(foyer);
    }

    @PutMapping("/updateFoyer")
    public Foyer updateFoyer(@RequestBody Foyer foyer) {
        return foyerServices.updateFoyer(foyer);
    }

    @DeleteMapping("/deleteFoyer/{id}")
    public void deleteFoyerById(@PathVariable("id") long id) {
        foyerServices.deleteFoyer(id);
    }
}
