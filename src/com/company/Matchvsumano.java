package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matchvsumano extends Match{

            Matchvsumano(String pl1, String pl2) throws IOException {
                try {
                    Tavolo_giocatore1=new Tavolo();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    Tavolo_giocatore2=new Tavolo();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Tavolo_giocatore1.Personadaind(Tavolo_giocatore2);
                Tavolo_giocatore2.Personadaind(Tavolo_giocatore1);
                Scrvifile.Scrvifile(Tavolo_giocatore1.pers,"player1.txt",Tavolo_giocatore1.P_Daindovinare,20,pl1);
                Scrvifile.Scrvifile(Tavolo_giocatore2.pers,"player2.txt",Tavolo_giocatore2.P_Daindovinare,20,pl2);

            }
    public boolean Checkwin(Match m1){
        if((m1.Tavolo_giocatore2.pers.size()==2)||(m1.Tavolo_giocatore1.pers.size()==2)){
            return true;
        }
        return false;
    }
    public int Checkwin1(Match m1){
        if((m1.Tavolo_giocatore2.pers.size()==2)){
            return 1;
        }
        return 0;
    }
    public void startpart(Match m1, String pl1, String pl2) throws IOException {
        int vitt;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        do {
            Process p = Runtime.getRuntime().exec("cmd /c .\\player2.txt"); long pid= p.pid();
            System.out.println(pl2+" Fai Una domanda a "+ pl1+"\n"+"Caratteristica Persona\n");
            String Domanda = new String(in.readLine());
            Process p2= Runtime.getRuntime().exec("cmd /c taskkill /IM Notepad.exe ");
            char aa;
            int i = 0;
            do { aa = Domanda.charAt(i);
                i++;
            } while (aa != ' ');
            String Domanda2 = Domanda.substring(i, Domanda.length());
            Domanda = Domanda.substring(0, i - 1);
            boolean b = m1.Tavolo_giocatore1.P_Daindovinare.domanda(Domanda, Domanda2, m1.Tavolo_giocatore1.P_Daindovinare);
            if (b == true) {
                int m = 1;
                System.out.println("Vero");//Player2.get(Domanda).
                for (int c = 1; c < m1.Tavolo_giocatore2.pers.size(); c++) {
                    if (Scrvifile.Interpreta(m1.Tavolo_giocatore2, Domanda, Domanda2, c)) { }
                    else {  m1.Tavolo_giocatore2.pers.remove(c); c--; }
                }
                Scrvifile.Scrvifile( m1.Tavolo_giocatore2.pers, "Player2.txt", m1.Tavolo_giocatore2.P_Daindovinare, m,pl2);
            }
            if (b == false) {
                int s = 50;
                System.out.println("Falso");
                for (int c = 1; c < m1.Tavolo_giocatore2.pers.size(); c++) {
                    if (Scrvifile.Interpreta(m1.Tavolo_giocatore2, Domanda, Domanda2, c)) {
                        if (c < 50) {
                            m1.Tavolo_giocatore2.pers.remove(c);
                            c--;
                        }
                    }
                }

                Scrvifile.Scrvifile(m1.Tavolo_giocatore2.pers, "Player2.txt", m1.Tavolo_giocatore2.P_Daindovinare, s,pl2);


            }  vitt=m1.Checkwin1(m1);
            Runtime.getRuntime().exec("cmd /c .\\player1.txt");
            System.out.println(pl1+" Fai Una domanda a "+pl2+"\n");
            System.out.println("Caratteristica Persona\n");
            Domanda = new String(in.readLine());
            i = 0;
            do {
                aa = Domanda.charAt(i);
                i++;
            } while (aa != ' ');
            Domanda2 = Domanda.substring(i, Domanda.length());     //doamanda 2 si , no
            Domanda = Domanda.substring(0, i - 1);                        //domanda  nome, capeli
             p2= Runtime.getRuntime().exec("cmd /c taskkill /IM Notepad.exe ");
            b = m1.Tavolo_giocatore2.P_Daindovinare.domanda(Domanda, Domanda2, m1.Tavolo_giocatore2.P_Daindovinare);
            if (b == true) {
                int m = 1;
                System.out.println("Vero");
                for (int c = 1; c < m1.Tavolo_giocatore1.pers.size(); c++) {
                    if (Scrvifile.Interpreta(m1.Tavolo_giocatore1, Domanda, Domanda2, c)) {
                    } else {
                        m1.Tavolo_giocatore1.pers.remove(c);
                        c--;
                    }
                }
                Scrvifile.Scrvifile(m1.Tavolo_giocatore1.pers, "Player1.txt", m1.Tavolo_giocatore1.P_Daindovinare, m,pl1);
            }
            if (b == false) {
                int s = 50;
                System.out.println("Falso");
                for (int c = 1; c < m1.Tavolo_giocatore1.pers.size(); c++) {
                    if (Scrvifile.Interpreta(m1.Tavolo_giocatore1, Domanda, Domanda2, c)) {
                        if (c < 50) {
                            m1.Tavolo_giocatore1.pers.remove(c);
                            c--;
                        }
                    }
                }
                Scrvifile.Scrvifile( m1.Tavolo_giocatore1.pers, "Player1.txt", m1.Tavolo_giocatore1.P_Daindovinare, s,pl1);


            }
        }   while (!m1.Checkwin(m1));
        if(vitt==1){
            System.out.println("Ha vinto il giocatore 2");
        } else System.out.println("Ha vinto il giocatore 1");

    }
}
