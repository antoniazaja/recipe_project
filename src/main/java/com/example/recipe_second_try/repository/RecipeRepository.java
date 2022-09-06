package com.example.recipe_second_try.repository;

import com.example.recipe_second_try.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
