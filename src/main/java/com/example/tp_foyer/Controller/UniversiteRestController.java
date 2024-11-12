package com.example.tp_foyer.Controller;

import com.example.tp_foyer.Entity.Universite; // Assuming Universite is the new entity
import com.example.tp_foyer.Services.IUniversiteServices; // Assuming the service interface is renamed accordingly
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/universite")
public class UniversiteRestController {
    IUniversiteServices universiteServices;

    @GetMapping("/retrieveAllUniversites")
    public List<Universite> retrieveAllUniversites() {
        List<Universite> universites = universiteServices.findAll();
        return universites;
    }

    @GetMapping("/retrieveUniversite/{id}")
    public Universite retrieveUniversiteById(@PathVariable("id") long id) {
        return universiteServices.findById(id);
    }

    @PostMapping("/addUniversite")
    public Universite addUniversite(@RequestBody Universite universite) {
        return universiteServices.createUniversite(universite);
    }

    @PutMapping("/updateUniversite")
    public Universite updateUniversite(@RequestBody Universite universite) {
        return universiteServices.updateUniversite(universite);
    }

    @DeleteMapping("/deleteUniversite/{id}")
    public void deleteUniversiteById(@PathVariable("id") long id) {
        universiteServices.deleteUniversite(id);
    }
}
