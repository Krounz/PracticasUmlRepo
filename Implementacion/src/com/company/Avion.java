package com.company;
import java.util.List;

public class Avion {
    CompaniaAerea companiaAerea;
    Motor[] motor;
    List <Vuelo> listaVuelos;


    public Avion(Motor motor){
        motor = new Motor[4];
    }

}
