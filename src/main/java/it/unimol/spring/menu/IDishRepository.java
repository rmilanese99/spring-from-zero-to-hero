package it.unimol.spring.menu;

import java.util.List;

public interface IDishRepository {

    List<Dish> getAll();
    Dish get(String name);

    Dish put(Dish dish);
    Dish replace(Dish toReplace, Dish replacement);

    void delete(Dish dish);
}
