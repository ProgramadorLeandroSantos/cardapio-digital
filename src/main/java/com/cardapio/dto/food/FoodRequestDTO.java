package com.cardapio.dto.food;

import com.cardapio.entities.FoodEntity;

public record FoodRequestDTO(String title, String image, Float price) {
    public FoodRequestDTO(FoodEntity foodEntity){
        this(foodEntity.getTitle(), foodEntity.getImage(), foodEntity.getPrice());
    }
}
