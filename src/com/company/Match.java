package com.company;

import java.io.IOException;

public abstract class Match {
    Tavolo Tavolo_giocatore1;
    Tavolo Tavolo_giocatore2;
    public abstract boolean Checkwin(Match m);
    public abstract int Checkwin1(Match m1);
    public abstract void startpart(Match m1, String pl1, String pl2) throws IOException;}
