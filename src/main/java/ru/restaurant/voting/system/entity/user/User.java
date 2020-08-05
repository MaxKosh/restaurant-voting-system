package ru.restaurant.voting.system.entity.user;

import lombok.Data;

import java.util.Date;
import java.util.Set;

@Data
public class User {
    private String name;
    private Integer userId;
    private String email;
    private String password;
    private Set<Role> roles;
    private Date registered;
}
