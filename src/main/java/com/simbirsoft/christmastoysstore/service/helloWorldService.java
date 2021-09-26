package com.simbirsoft.christmastoysstore.service;

import com.simbirsoft.christmastoysstore.repositoty.helloWorldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import org.springframework.web.bind.annotation.
@Service
public class helloWorldService implements helloWorld{
    @Autowired
    helloWorldRepository helloWorldRepository;

    @Override
    public String getHello() {
        return "Hello World!";
    }
}
