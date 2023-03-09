package it.unimol.spring.menu;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishService {

    private final IDishRepository dishes;

    public DishService(IDishRepository dishes) {
        this.dishes = dishes;
    }

    public List<Dish> getAll() {
        return this.dishes.getAll();
    }

    public Dish put(@Valid Dish dish) {
        return this.dishes.put(dish);
    }
}
