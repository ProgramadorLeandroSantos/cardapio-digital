package com.cardapio.services.food;

import com.cardapio.entities.FoodEntity;
import com.cardapio.repositories.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {
    @Autowired
    private FoodRepository foodRepository;

    public List<FoodEntity> readAll(){
        return foodRepository.findAll();
    }
}
