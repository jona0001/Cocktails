package org.example.cocktails.model;

import org.example.cocktails.util.CocktailStrength;
import org.example.cocktails.util.CocktailType;

import java.util.UUID;

public class CocktailOrder {
    private CocktailType cocktailType;
    private CocktailStrength cocktailStrength;
    private UUID id;

    public CocktailOrder() {
    }



    public CocktailType getCocktailType() {
        return cocktailType;
    }

    public void setCocktailType(CocktailType cocktailType) {
        this.cocktailType = cocktailType;
    }

    public CocktailStrength getCocktailStrength() {
        return cocktailStrength;
    }

    public void setCocktailStrength(CocktailStrength cocktailStrength) {
        this.cocktailStrength = cocktailStrength;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
