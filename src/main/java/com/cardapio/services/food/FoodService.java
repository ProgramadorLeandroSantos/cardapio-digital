package com.cardapio.services.food;

import com.cardapio.dto.food.FoodRequestDTO;
import com.cardapio.dto.food.FoodResponseDTO;
import com.cardapio.entities.FoodEntity;
import com.cardapio.repositories.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {
    @Autowired
    private FoodRepository foodRepository;

    public List<FoodResponseDTO> readAll(){
        List<FoodResponseDTO> foodDTOList =  foodRepository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foodDTOList;
    }

    public void create(FoodRequestDTO foodRequestDTO){
        FoodEntity foodEntity = new FoodEntity(foodRequestDTO);
        foodRepository.save(foodEntity);
    }
}
