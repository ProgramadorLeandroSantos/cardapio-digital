package com.cardapio.entities;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "foods")
@Entity
@Data
public class FoodEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private String image;

    private Integer price;
}
