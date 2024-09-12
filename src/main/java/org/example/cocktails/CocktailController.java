package org.example.cocktails;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CocktailController {
    private final CocktailService cocktailService;

    public CocktailController(CocktailService cocktailService) {
        this.cocktailService = cocktailService;
    }

    @GetMapping("/")
    public String getAllCocktails(Model model){
        model.addAttribute("cocktails", cocktailService.getAllCocktails());
        return "cocktails";
    }

    @GetMapping("/search")
    public String searchByIngredient(Model model, @RequestParam String ingredient) {
        List<Cocktail> cocktails = cocktailService.findCocktail(ingredient); // Use actual data
        model.addAttribute("cocktails", cocktails); // Pass the found cocktails to the model
        model.addAttribute("ingredient", ingredient); // Pass the ingredient to the model
        return "cocktail-ingredients"; // View name
    }

    @GetMapping("/order")
    public String showOrderForm(Model model){
        CocktailOrder cocktailOrder = new CocktailOrder();
        cocktailOrder.setCocktailStrength(CocktailStrength.SINGLE);
        model.addAttribute("cocktailOrder", cocktailOrder); // Ensure attribute name matches Thymeleaf
        model.addAttribute("cocktailMenu", CocktailMenu.values());
        model.addAttribute("cocktailType", CocktailType.values());
        model.addAttribute("cocktailStrength", CocktailStrength.values());
        return "order-form";
    }
    @PostMapping("/order")
    public String placeOrder(@ModelAttribute CocktailOrder cocktailOrder){
        cocktailService.placeOrder(cocktailOrder);
        return "redirect:/orders";
    }
    @GetMapping("/orders")
    public String showOrders(Model model){
        model.addAttribute("orders",cocktailService.getAllCocktailOrders());
        return "order-list";
    }

}
