package it.unimol.spring.menu;

import jakarta.validation.Valid;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ListDishRepository implements IDishRepository {

    private final List<Dish> dishes = new ArrayList<>();

    @Override
    public List<Dish> getAll() {
        return this.dishes;
    }

    @Override
    public Dish get(String name) {
        return this.dishes.stream()
                .filter(d -> d.getName().equals(name))
                .findAny()
                .orElse(null);
    }

    @Override
    public Dish put(@Valid Dish dish) {
        this.dishes.add(dish);

        return dish;
    }

    @Override
    public Dish replace(Dish toReplace, @Valid Dish replacement) {
        int index = this.dishes.indexOf(toReplace);

        if (index >= 0) {
            this.dishes.set(index, replacement);
            return replacement;
        }

        return null;
    }

    @Override
    public void delete(Dish dish) {
        this.dishes.remove(dish);
    }
}
