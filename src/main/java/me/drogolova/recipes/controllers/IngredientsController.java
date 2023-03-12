package me.drogolova.recipes.controllers;

import me.drogolova.recipes.services.Ingredients;
import me.drogolova.recipes.services.IngredientsServices;
import me.drogolova.recipes.services.Recipes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ingredients")
public class IngredientsController {

    private IngredientsServices ingredientsServices;

    public IngredientsController(IngredientsServices ingredientsServices) {
        this.ingredientsServices = ingredientsServices;
    }

    @PostMapping("/add")
    public void addIngredient(Ingredients ingredient) {
        ingredientsServices.addIngredient(ingredient);
    }

    @GetMapping("/getIngredient")
    public Ingredients getIngredient(Integer integer) {
        return ingredientsServices.getIngredient(integer);
    }
}
