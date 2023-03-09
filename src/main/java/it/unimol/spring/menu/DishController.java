package it.unimol.spring.menu;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dishes")
public class DishController {

    private final DishService service;

    public DishController(DishService service) {
        this.service = service;
    }

    @GetMapping("/")
    public List<Dish> getAll() {
        return this.service.getAll();
    }

    @PostMapping("/")
    public Dish put(@RequestBody Dish dish) {
        return this.service.put(dish);
    }
}
