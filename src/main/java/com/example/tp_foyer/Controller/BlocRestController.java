package com.example.tp_foyer.Controller;

import com.example.tp_foyer.Entity.Bloc;
import com.example.tp_foyer.Services.IBlocServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/bloc")
public class BlocRestController {
    IBlocServices blocServices;

    @GetMapping("/retrieveAllBloc")
    public List<Bloc> retrieveAllBloc() {
        List<Bloc> blocs = blocServices.getAllBloc();
        return blocs;
    }

    @GetMapping("/retrieveBloc/{id}")
    public Bloc retrieveBlocById(@PathVariable("id") long id) {
        return blocServices.getBlocById(id);
    }

    @PostMapping("/addBloc")
    public Bloc addBloc(@RequestBody Bloc bloc) {
        return blocServices.addBloc(bloc);
    }

    @PutMapping("/updateBloc")
    public Bloc updateBloc(@RequestBody Bloc bloc) {
        return blocServices.updateBloc(bloc);
    }

    @DeleteMapping("/deleteBloc/{id}")
    public void deleteBlocById(@PathVariable("id") long id) {
        blocServices.deleteBloc(id);
    }
}
