package com.company;

import java.util.List;

public class Vuelo {
    Avion avion;
    Piloto piloto;
    List<Reserva> reservas;
    public Vuelo(Reserva reserva, Piloto piloto){
        piloto = new Piloto[2];
        reservas = new List<Reserva>();
    }
}
