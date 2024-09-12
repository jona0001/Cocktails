package org.example.cocktails;

public class Cocktail {
    private String name;
    private String ingredients;

    public Cocktail(String name, String ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public String getIngredients(){
        return ingredients;
    }
}
