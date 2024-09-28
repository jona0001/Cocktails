package org.example.cocktails.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CocktailTest {

    @Test
    void getName() {
        Cocktail cocktail = new Cocktail(
                "gin and tonic",
                "gin and tonic",
                "gin and tonic",
                1);
        assertEquals("gin and tonic",cocktail.getName());
    }

    @Test
    void getId() {
        Cocktail cocktail = new Cocktail("gin and tonic",
                "gin and tonic",
                "gin and tonic",
                2);

        assertEquals("3", cocktail.getId());
    }
}