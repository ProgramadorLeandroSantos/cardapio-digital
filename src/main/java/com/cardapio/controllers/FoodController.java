package com.cardapio.controllers;

import com.cardapio.dto.food.FoodRequestDTO;
import com.cardapio.dto.food.FoodResponseDTO;
import com.cardapio.entities.FoodEntity;
import com.cardapio.services.food.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/foods")
public class FoodController {
    @Autowired
    private FoodService foodService;

    @GetMapping("/")
    public List<FoodResponseDTO> readAll(){
        return foodService.readAll();
    }

    @PostMapping("/")
    public void create(@RequestBody FoodRequestDTO foodRequestDTO){
        foodService.create(foodRequestDTO);
    }
}
