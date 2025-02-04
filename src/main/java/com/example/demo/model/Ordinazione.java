package com.example.demo.model;

import com.example.demo.CartaMenù;
import com.example.demo.enumerati.StatoOrdine;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class Ordinazione {
    private List<CartaMenù> prodottiMenu;
    private StatoOrdine statoOrdine;
    private int numeroOrdine;
    private int numeroCoperti;
    private LocalTime oraDiAcquisizione;
    private double totaleOrdinazioni;
}
