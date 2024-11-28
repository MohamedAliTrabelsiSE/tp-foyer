package com.example.tp_foyer.Services;

import com.example.tp_foyer.Entity.Bloc;
import com.example.tp_foyer.Repositories.BlocRepositories;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
@AllArgsConstructor
public class BlocServicesImp implements IBlocServices{
    private static final Logger log = LoggerFactory.getLogger(BlocServicesImp.class);
    BlocRepositories blocRepositories;
    private List<Bloc> cachedBlocs = new ArrayList<>();


    @Override
    public List<Bloc> getAllBloc() {
        return blocRepositories.findAll();
    }
    @Scheduled(fixedDelay = 10000)
    public void updateCachedBlocs() {
        cachedBlocs = blocRepositories.findAll();
        log.info("Cached blocs updated: {}", cachedBlocs);
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
