package com.example.spring1;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class MarutiCars implements Cars  {

    @Override
    public String getModels() {
        return "Alto and Baleno";
    }
}


