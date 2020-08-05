package ru.restaurant.voting.system.entity.restaurant;

import lombok.Data;

import java.util.Date;
import java.util.Set;

@Data
public class Menu {
    private Integer menuId;
    private Date date;
    private Set<Dish> dishes;
    private Restaurant restaurant;


}
