package com.cardapio.entities;

import jakarta.persistence.*;

@Entity(name = "foods")
@Table(name = "foods")
public class FoodEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private String image;

    private Integer price;
}
