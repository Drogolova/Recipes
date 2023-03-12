package me.drogolova.recipes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import me.drogolova.recipes.services.Recipes;
import me.drogolova.recipes.services.RecipesServices;

@RestController
@RequestMapping("/recipes")
public class RecipeController {
    private RecipesServices recipesServices;

    public RecipeController(RecipesServices recipesServices) {
        this.recipesServices = recipesServices;
    }

    @GetMapping("/add")
    public void addRecipe(Recipes recipe) {
        recipesServices.addRecipe(recipe);
    }

    @GetMapping("/get")
    public Recipes recipes(Integer integer) {
        return recipesServices.getRecipe(integer);
    }
}
