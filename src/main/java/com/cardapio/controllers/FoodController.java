package com.cardapio.controllers;

import com.cardapio.entities.FoodEntity;
import com.cardapio.services.food.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/foods")
public class FoodController {
    @Autowired
    private FoodService foodService;

    @GetMapping("/")
    public List<FoodEntity> readAll(){
        return foodService.readAll();
    }
}
