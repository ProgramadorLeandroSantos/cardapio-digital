package com.cardapio.entities;

import com.cardapio.dto.food.FoodRequestDTO;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "foods")
@Entity
@Data
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class FoodEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private String image;

    private Float price;

    public FoodEntity(FoodRequestDTO foodRequestDTO){
        this.title = foodRequestDTO.title();
        this.image = foodRequestDTO.image();
        this.price = foodRequestDTO.price();
    }
}
