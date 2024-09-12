package org.example.cocktails;

import java.util.UUID;

public class CocktailOrder {
    private CocktailMenu cocktailMenu;
    private CocktailType cocktailType;
    private CocktailStrength cocktailStrength;
    private UUID id;

    public CocktailOrder() {
    }

    public CocktailMenu getCocktailMenu() {
        return cocktailMenu;
    }

    public void setCocktailMenu(CocktailMenu cocktailMenu) {
        this.cocktailMenu = cocktailMenu;
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
