package com.erudos.tacocloud.data;

import com.erudos.tacocloud.Ingredient;
import org.springframework.data.repository.CrudRepository;



public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
