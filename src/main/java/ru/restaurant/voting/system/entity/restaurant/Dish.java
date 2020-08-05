package ru.restaurant.voting.system.entity.restaurant;

import lombok.Data;

@Data
public class Dish {
    private Integer dishId;
    private String description;
    private Integer price;
    private Menu menu;
}
