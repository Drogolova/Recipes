package me.drogolova.recipes.services;

import me.drogolova.recipes.model.Ingredients;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class IngredientsServicesImpl implements IngredientsServices {

    Map<Integer, Ingredients> ingredientsStorage;
    private static Integer counter = 0;

    @Override
    public void addIngredient(Ingredients ingredient) {
        ingredientsStorage.put(counter++, ingredient);
    }

    @Override
    public Ingredients getIngredient(Integer integer) {
        if (!ingredientsStorage.containsKey(integer)) {
            System.out.println("Игридиента с таким порядковым номером не найдено");
            return null;
        } else {
            return ingredientsStorage.get(integer);
        }
    }
}
