package com.Burak.Burak.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter

public class Ucuslar {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String Kalkis_Havaalani;
    private String Varis_Havaalani;
    private String Kalkis_Tarih;
    private String Donus_Tarih;
    private String Fiyat;
}
