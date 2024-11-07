package com.example.tp_foyer.Services;

import com.example.tp_foyer.Entity.Bloc;

import java.util.List;

public interface IBlocServices {
    List<Bloc> getAllBloc();
    Bloc getBlocById(long id);
    Bloc updateBloc(Bloc bloc);
    Bloc addBloc(Bloc bloc);
    void deleteBloc(long id);

}
