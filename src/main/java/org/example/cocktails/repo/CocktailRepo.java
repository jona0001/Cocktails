package org.example.cocktails.repo;

import org.example.cocktails.model.Cocktail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CocktailRepo {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Cocktail addCocktail(Cocktail cocktail) {
        String query = "INSERT INTO cocktail (Name, Description, Ingredients, Price) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(query, cocktail.getName(), cocktail.getDescription(), cocktail.getIngredients(), cocktail.getPrice());
        return cocktail;
    }
}

