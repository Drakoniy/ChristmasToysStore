package com.simbirsoft.christmastoysstore.controller;


import com.simbirsoft.christmastoysstore.model.SimpleUser;
import com.simbirsoft.christmastoysstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ComponentScan(basePackages = {"com.simbirsoft.christmastoysstore.service",
        "com.simbirsoft.christmastoysstore.repository",
        "com.simbirsoft.christmastoysstore.model"})
@RequestMapping("/api/users")
public class UserRestController {
   @Autowired
   UserService userService;

    @GetMapping
    public List<SimpleUser> getAll()
    {
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public SimpleUser getById(@PathVariable long id)
    {
        return userService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delById (@PathVariable Long id)
    {
        userService.delById(id);
    }

    @PostMapping
    public SimpleUser create (@RequestBody SimpleUser simpleUser)
    {
        userService.create(simpleUser);
        return simpleUser;
    }


}
