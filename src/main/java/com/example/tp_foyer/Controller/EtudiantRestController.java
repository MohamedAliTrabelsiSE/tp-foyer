package com.example.tp_foyer.Controller;

import com.example.tp_foyer.Entity.Etudiant;
import com.example.tp_foyer.Services.IEtudiantServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantRestController {
    IEtudiantServices etudiantServices;

    @GetMapping("/retrieveAllEtudiant")
    public List<Etudiant> retrieveAllEtudiant() {
        List<Etudiant> etudiants = etudiantServices.findAll();
        return etudiants;
    }

    @GetMapping("/retrieveEtudiant/{id}")
    public Etudiant retrieveEtudiantById(@PathVariable("id") long id) {
        return etudiantServices.findById(id);
    }

    @PostMapping("/addEtudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantServices.createEtudiant(etudiant);
    }

    @PutMapping("/updateEtudiant")
    public Etudiant updateEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantServices.updateEtudiant(etudiant);
    }

    @DeleteMapping("/deleteEtudiant/{id}")
    public void deleteEtudiantById(@PathVariable("id") long id) {
        etudiantServices.deleteEtudiant(id);
    }
}
