package com.example.searchviewexample;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import java.util.List;

public class PokedexViewModel extends ViewModel {

    PokemonRepository repository = new PokemonRepository();

    public void searchPokemon(String query) {
        repository.searchPokemon(query);
    }

    public LiveData<List<Pokemon>> getSearchedPokemon() {
        return repository.getSearchedPokemon();
    }

}
