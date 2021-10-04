package com.simbirsoft.christmastoysstore.model;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class SimpleUser {

    private Long id;
    private String login;
    private String password;
    private String role;
}
