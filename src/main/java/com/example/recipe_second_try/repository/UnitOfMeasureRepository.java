package com.example.recipe_second_try.repository;

import com.example.recipe_second_try.domain.Category;
import com.example.recipe_second_try.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long> {
    Optional<UnitOfMeasure> findByDescription(String description);

}
