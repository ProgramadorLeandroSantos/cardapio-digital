package com.cardapio.repositories;

import com.cardapio.entities.FoodEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<FoodEntity,Long> {
}
