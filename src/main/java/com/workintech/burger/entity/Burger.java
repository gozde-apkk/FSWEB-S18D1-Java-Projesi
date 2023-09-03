package com.workintech.burger.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "burger" ,schema = "burger-api")
public class Burger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotNull
    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private int price;

    @Column(name = "is_vegan")
    private boolean isVegan;

    @Column(name = "bread_type")
    private String breadType;

    @Column(name = "contents")
    private List<String> contents;
}
