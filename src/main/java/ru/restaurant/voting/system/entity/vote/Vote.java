package ru.restaurant.voting.system.entity.vote;

import ru.restaurant.voting.system.entity.restaurant.Menu;
import ru.restaurant.voting.system.entity.restaurant.Restaurant;
import ru.restaurant.voting.system.entity.user.User;

import java.time.LocalDateTime;

public class Vote {
    private Integer voteId;
    private User user;
    private Restaurant restaurant;
    private Menu menu;
    private LocalDateTime votedDateTime;
    private boolean voted;
}
