package org.example.cocktails.controllers;

import org.example.cocktails.model.Cocktail;
import org.example.cocktails.model.CocktailOrder;
import org.example.cocktails.service.CocktailService;
import org.example.cocktails.util.CocktailStrength;
import org.example.cocktails.util.CocktailType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/save")
public class CocktailController {
    private final CocktailService cocktailService;


    //dependency injection.
    public CocktailController(CocktailService cocktailService) {
        this.cocktailService = cocktailService;
    }

    @GetMapping("/")
    public String showIndex(){
        return "index";
    }

    @GetMapping("/add")
    public String addCocktailForm(Model model){
        Cocktail cocktail = new Cocktail();
        model.addAttribute("cocktail",cocktail);
        //model object for our HTML, key-value pair
        return "addCocktail";

    }

    @PostMapping("/save")
    public String saveNewCocktail(@ModelAttribute Cocktail cocktail){
        cocktailService.addCocktail(cocktail);
        return "redirect:/cocktail-List";
    }



}
