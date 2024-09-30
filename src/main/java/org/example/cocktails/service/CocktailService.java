package org.example.cocktails.service;

import org.example.cocktails.model.Cocktail;
import org.example.cocktails.model.CocktailOrder;
import org.example.cocktails.repo.CocktailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CocktailService {
    private final CocktailRepo cocktailRepo;

    @Autowired
    public CocktailService(CocktailRepo cocktailRepo) {
        this.cocktailRepo = cocktailRepo;
    }

    public Cocktail addCocktail(Cocktail cocktail){
       return cocktailRepo.addCocktail(cocktail);
   }



}
