package it.unimol.spring.menu;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Dish {

    enum Course {
        FIRST, SECOND, SALAD
    }

    enum Allergen {
        GLUTEN, LACTOSE, NUTS, FISH, SHELLFISH, EGG, SOY, SESAME
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Il nome del piatto non può essere vuoto")
    private String name;

    @NotNull(message = "Il piatto deve avere una categoria")
    private Course course;

    @NotNull(message = "Il piatto deve avere una lista di allergeni")
    private List<Allergen> allergens = new ArrayList<>();

    @Positive(message = "Il prezzo del piatto non può essere zero o negativo")
    private double price;
}
