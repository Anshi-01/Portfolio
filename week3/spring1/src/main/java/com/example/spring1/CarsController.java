package com.example.spring1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarsController  {

    private Cars cars;

//    @Autowired      //inject the dependency, not compulsary to add autowired here
//    public CarsController(Cars cars) {
//        this.cars = cars;
//    }

    @Autowired    //setter injection, compulsary to write autowired here
public void setCars(@Qualifier("tataCars")Cars cars){
        this.cars= cars;
    }

    @GetMapping("/")
   public String showMsg(){
        return cars.getModels();
   }
}
