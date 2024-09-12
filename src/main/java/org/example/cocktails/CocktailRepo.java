package org.example.cocktails;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CocktailRepo {
    private List<Cocktail> drinks = new ArrayList<>();
    private List<CocktailOrder> cocktailOrder = new ArrayList<>();



    public CocktailRepo() {
        drinks.add(new Cocktail("Gin Hass", "Gin"));
        drinks.add(new Cocktail("whiskey sour", "whiskey"));
        drinks.add(new Cocktail("gin tonic", "Gin"));
        drinks.add(new Cocktail("Amaretto sour", "Amaretto"));
        drinks.add(new Cocktail("Italicus sour","Italicus"));
        drinks.add(new Cocktail("Mojito", "Rum"));
    }

    public List<Cocktail> getDrinks() {
        return drinks;
    }

    public List<Cocktail> getDrinksByName(String ingredient) {
        List<Cocktail> foundDrink = new ArrayList<>();
        for (Cocktail cocktail : drinks) {
            if (cocktail.getIngredients().equalsIgnoreCase(ingredient)) {
                foundDrink.add(cocktail);
            }
        }
        return foundDrink;
    }

    public void addOrder(CocktailOrder order) {
        cocktailOrder.add(order);
    }
    public List<CocktailOrder> getAllOrders() {
        return new ArrayList<>(cocktailOrder);
    }



}

