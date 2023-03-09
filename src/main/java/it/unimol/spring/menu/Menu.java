package it.unimol.spring.menu;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
public class Menu {

    @FutureOrPresent(message = "La data del menu deve essere odierna o futura")
    private LocalDate date;

    @NotEmpty(message = "Il menu deve avere almeno un piatto")
    private List<Dish> dishes = new ArrayList<>();
}
