package com.company;

import java.io.IOException;
import java.util.ArrayList;

public class Tavolo {
    ArrayList<Persona> pers = new ArrayList<Persona>();
    Persona P_Daindovinare;
    Tavolo() throws IOException {
        for (int i=0; i<50;i++){
            pers.add(new Persona());
        }

    }
    void Personadaind(Tavolo p) {
        int emme = ((int) (Math.random() * 100) % 48)+1;
    P_Daindovinare=p.pers.get(emme);
    }

    }

