package me.drogolova.recipes.services;

import me.drogolova.recipes.model.Recipes;

public interface RecipesServices {

    void addRecipe(Recipes recipes);
    Recipes getRecipe(Integer integer);

}
