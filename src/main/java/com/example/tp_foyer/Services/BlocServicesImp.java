package com.example.tp_foyer.Services;

import com.example.tp_foyer.Entity.Bloc;
import com.example.tp_foyer.Repositories.BlocRepositories;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BlocServicesImp implements IBlocServices{
    BlocRepositories blocRepositories;

    @Override
    public List<Bloc> getAllBloc() {
        return blocRepositories.findAll();
    }

    @Override
    public Bloc getBlocById(long id) {
        return blocRepositories.findById(id).get();
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepositories.save(bloc);
    }

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepositories.save(bloc);
    }

    @Override
    public void deleteBloc(long id) {
        blocRepositories.deleteById(id);

    }
}
