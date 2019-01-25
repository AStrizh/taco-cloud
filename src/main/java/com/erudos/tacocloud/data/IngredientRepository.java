package com.erudos.tacocloud.data;

import com.erudos.tacocloud.Ingredient;

public interface IngredientRepository {

    Iterable<Ingredient> findAll();
    Ingredient findById(String id);
    Ingredient save(Ingredient ingredient);
}
