package com.example.demo.runner;

import com.example.demo.model.Ordinazione;
import com.example.demo.service.GestioneOrdine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.util.ArrayList;
import java.util.List;

public class Runner implements CommandLineRunner {

    List<Ordinazione> listaOrdinazioni = new ArrayList<>();

    @Autowired private GestioneOrdine gestioneOrdini;


    @Override
    public void run(String... args) throws Exception {

    }
}
