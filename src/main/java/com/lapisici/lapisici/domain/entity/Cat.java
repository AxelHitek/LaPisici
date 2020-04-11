package com.lapisici.lapisici.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "CATS")
@SequenceGenerator(name = "CatSequenceGenerator", initialValue = 1)
public class Cat {

    @GeneratedValue(generator = "CatSequenceGenerator", strategy = GenerationType.SEQUENCE)
    @Id
    @Getter
    @Setter
    private Long id;

    @Column(name = "NAME")
    @Getter
    @Setter
    private String name;

    @Column(name = "COLOR")
    @Getter
    @Setter
    private String color;

    public Cat(Long id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }

    public Cat() {
    }
}
