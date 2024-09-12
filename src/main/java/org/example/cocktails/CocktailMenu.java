package org.example.cocktails;
public enum CocktailMenu {
    MIMOSA("Mimosa"),
    MOJITO("Mojito"),
    BELLINI("Bellini");

    private String displayName;

    CocktailMenu(String displayName){
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
