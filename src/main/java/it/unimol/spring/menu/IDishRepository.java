package it.unimol.spring.menu;

import jakarta.validation.Valid;

import java.util.List;

public interface IDishRepository {

    List<Dish> getAll();

    Dish get(String name);

    Dish put(@Valid Dish dish);

    Dish replace(Dish toReplace, @Valid Dish replacement);

    void delete(Dish dish);
}
