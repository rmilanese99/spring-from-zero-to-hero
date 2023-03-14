package it.unimol.spring.menu;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
public class DishService {

    private final IDishRepository dishes;

    public DishService(IDishRepository dishes) {
        this.dishes = dishes;
    }

    public List<Dish> getAll() {
        return (List<Dish>) this.dishes.findAll();
    }

    public Dish put(@Valid Dish dish) {
        return this.dishes.save(dish);
    }
}
