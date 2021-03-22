package com.example.searchviewexample;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PokemonRepository {
    private final List<Pokemon> pokemonList;
    private final MutableLiveData<List<Pokemon>> searchedPokemon = new MutableLiveData<>();

    public PokemonRepository(){
        pokemonList = new ArrayList<>();
        pokemonList.add(new Pokemon("Bulbasaur", 1, R.drawable.p1));
        pokemonList.add(new Pokemon("Ivysaur", 2, R.drawable.p2));
        pokemonList.add(new Pokemon("Venusaur", 3, R.drawable.p3));
        pokemonList.add(new Pokemon("Charmander", 4, R.drawable.p4));
        pokemonList.add(new Pokemon("Charmeleon", 5, R.drawable.p5));
        pokemonList.add(new Pokemon("Charizard", 6, R.drawable.p6));
        pokemonList.add(new Pokemon("Squirtle", 7, R.drawable.p7));
        pokemonList.add(new Pokemon("Wartortle", 8, R.drawable.p8));
        pokemonList.add(new Pokemon("Blastoise", 9, R.drawable.p9));
        pokemonList.add(new Pokemon("Caterpie", 10, R.drawable.p10));
        pokemonList.add(new Pokemon("Metapod", 11, R.drawable.p11));
        pokemonList.add(new Pokemon("Butterfree", 12, R.drawable.p12));

        searchedPokemon.setValue(pokemonList);
    }

    public void searchPokemon(String query){
        List<Pokemon> result = new ArrayList<>();
        for (Pokemon p : pokemonList) {
            if (p.getName().toLowerCase().contains(query.toLowerCase())) {
                result.add(p);
            }
        }
        searchedPokemon.setValue(result);
    }

    public LiveData<List<Pokemon>> getSearchedPokemon() {
        return searchedPokemon;
    }
}
