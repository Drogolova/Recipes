package me.drogolova.recipes.services;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class RecipesServicesImpl implements RecipesServices {

    Map<Integer, Recipes> recipeStorage = new HashMap<>();
    private static Integer counter = 0;

    @Override
    public void addRecipe(Recipes recipe) {
        recipeStorage.put(counter++, recipe);
    }

    @Override
    public Recipes getRecipe(Integer integer) {
        if (!recipeStorage.containsKey(integer)) {
            System.out.println("Рецепта с таким порядковым номером не найдено");
            return null;
        } else {
            return recipeStorage.get(integer);
        }
    }
}
