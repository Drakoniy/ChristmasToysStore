package com.simbirsoft.christmastoysstore.controller;

import com.simbirsoft.christmastoysstore.service.helloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class restController {
    @Autowired
    helloWorldService helloWorld;

    @GetMapping("/christmastoysstore")
    String all()
    {
        return helloWorld.getHello();
    }
}
