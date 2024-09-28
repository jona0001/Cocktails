package org.example.cocktails.util;
public enum CocktailType {
    CLASSIC ("Classic"),
    MOCKTAIL ("Mocktail");


    private String displayName;

    CocktailType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
