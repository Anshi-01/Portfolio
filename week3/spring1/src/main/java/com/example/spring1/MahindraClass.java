package com.example.spring1;


import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Lazy
public class MahindraClass implements Cars {


    @Override
    public String getModels(){
        return "Scorpio";
    }
}
