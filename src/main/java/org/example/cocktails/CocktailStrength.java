package org.example.cocktails;
public enum CocktailStrength {
    SINGLE("Single"),
    DOUBLE("Double");

    private String displayName;

    CocktailStrength(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
