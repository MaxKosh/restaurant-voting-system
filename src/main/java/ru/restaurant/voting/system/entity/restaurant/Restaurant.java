package ru.restaurant.voting.system.entity.restaurant;

import lombok.Data;
import ru.restaurant.voting.system.entity.vote.Vote;

import java.util.List;

@Data
public class Restaurant {
    private Integer restaurantId;
    private String name;
    private List<Vote> rating;
}
