package org.example.cocktails.model;

import org.example.cocktails.util.CocktailStrength;
import org.example.cocktails.util.CocktailType;
import java.util.List;

public class Cocktail {
    private String name;
    private String description;
    private String ingredients;
    private int price;

    public Cocktail(String name, String description, String ingredients, int price) {
        this.name = name;
        this.description = description;
        this.ingredients = ingredients;
        this.price=price;
    }

    public Cocktail() {

    }

    public String getName() {
        return name;
    }

    public String getIngredients(){
        return ingredients;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
