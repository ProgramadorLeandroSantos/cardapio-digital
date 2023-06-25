package com.cardapio.dto.food;

import com.cardapio.entities.FoodEntity;

public record FoodResponseDTO(Long id, String title, String image, Float price) {
    public FoodResponseDTO(FoodEntity foodEntity){
        this(foodEntity.getId(), foodEntity.getTitle(), foodEntity.getImage(), foodEntity.getPrice());
    }
}
