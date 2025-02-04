package com.example.demo.model;

import com.example.demo.enumerati.StatoTavolo;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class Tavolo {
    private int numeroTavolo;
    private int postiMax;
    private StatoTavolo statoTavolo;
}

