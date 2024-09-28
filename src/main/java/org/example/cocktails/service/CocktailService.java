package org.example.cocktails.service;

import org.example.cocktails.model.Cocktail;
import org.example.cocktails.model.CocktailOrder;
import org.example.cocktails.repo.CocktailRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CocktailService {
    CocktailRepo cocktailRepo = new CocktailRepo();

   public Cocktail addCocktail(Cocktail cocktail){
       return cocktailRepo.addCocktail(cocktail);
   }



}
