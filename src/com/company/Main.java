package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Match m1;
        System.out.println("nome player 2");
        String pl2 = new String(in.readLine());
        System.out.println("nome player 1");
        String pl1 = new String(in.readLine());
        if (pl1.equalsIgnoreCase("cpu")){
            m1=new Matchvscpu();
        } else m1=new Matchvsumano(pl1,pl2);
        m1.startpart(m1,pl1,pl2);
        }

    }


