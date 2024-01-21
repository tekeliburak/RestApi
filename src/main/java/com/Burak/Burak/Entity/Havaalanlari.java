package com.Burak.Burak.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table
@Entity
@Getter
@Setter
public class Havaalanlari {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String Sehir;
}
