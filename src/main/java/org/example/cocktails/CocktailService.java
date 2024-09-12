package org.example.cocktails;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CocktailService {

    private final CocktailRepo cocktailRepo;

    public CocktailService(CocktailRepo cocktailRepo){
        this.cocktailRepo = cocktailRepo;
    }

    public List<Cocktail> getAllCocktails(){
        return cocktailRepo.getDrinks();
    }

    public List<Cocktail> findCocktail(String ingredient){
        return cocktailRepo.getDrinksByName(ingredient);
    }

    public void placeOrder(CocktailOrder order) {
        cocktailRepo.addOrder(order);
    }

    public List<CocktailOrder> getAllCocktailOrders() {
        return cocktailRepo.getAllOrders();
    }


}
