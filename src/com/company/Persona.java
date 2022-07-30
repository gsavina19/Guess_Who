package com.company;

public class Persona {
    String Naso;
    String baffi;
    String barba;
    String carnagione;
    String colore_occhi;
    String colore_capelli;
    String occhiali;
    String cappello;
    String sesso;
    String orecchini;
    String nome;
    String eta;
    String lungh_capelli;
    String tipo_capelli;

    Persona() {
        sesso = Dropsesso();
        nome = Dropname();
        orecchini = Dropbool();
        occhiali = Dropbool();
        cappello = Dropbool();
        baffi = Dropbool2();
        barba = Dropbool2();
        carnagione = Dropcarnagione();
        Naso= Dropnaso();
        lungh_capelli=Droplungh();
        colore_capelli=Dropcolcap();
        eta= Dropeta();
        colore_occhi=DropColOcch();
        tipo_capelli=tipocap();
    }

    String Dropname() {
        int random;
        random = dropnum(15);
        if (sesso == "M") {
            if (random == 0) {
                return "Michele";
            }
            if (random == 1) {
                return "Luigi";
            }
            if (random == 2) {
                return "Marco";
            }
            if (random == 3) {
                return "Rufino";
            }
            if (random == 4) {
                return "Umberto";
            }
            if (random == 5) {
                return "Lorenzo";
            }
            if (random == 6) {
                return "Giuseppe";
            }
            if (random == 7) {
                return "Domenico";
            }
            if (random == 8) {
                return "Nello";
            }
            if (random == 9) {
                return "Pietro";
            }
            if (random == 10) {
                return "Emanuele";
            }
            if (random == 11) {
                return "Luca";
            }
            if (random == 12) {
                return "Stefano";
            }
            if (random == 13) {
                return "Vincenzo";
            }
            if (random == 14) {
                return "Valerio";
            }
        }
        if (sesso == "F") {
            if (random == 0) {
                return "Krizia";
            }
            if (random == 1) {
                return "Alisia";
            }
            if (random == 2) {
                return "Paola";
            }
            if (random == 3) {
                return "Raffaella";
            }
            if (random == 4) {
                return "Lorena";
            }
            if (random == 5) {
                return "Maria";
            }
            if (random == 6) {
                return "Giusy";
            }

            if (random == 7) {
                return "Micol";
            }
            if (random == 8) {
                return "Ilaria";
            }
            if (random == 9) {
                return "Francesca";
            }
            if (random == 10) {
                return "Elena";
            }
            if (random == 11) {
                return "Giorgia";
            }
            if (random == 12) {
                return "Sabrina";
            }
            if (random == 13) {
                return "Lina";
            }
            if (random == 14) {
                return "Giuliana";
            }

        }

        return "";
    }

    String Dropsesso() {
        int p = dropnum(2);
        if (p == 0) {
            return "M";
        } else return "F";
    }

    String Dropbool() {
        int p = dropnum(2);
        if (p == 0) {
            return "Si";
        } else return "No";
    }

    String Dropbool2() {
        int p = dropnum(2);
        if (sesso == "F") {
            p = 1;
        }
        if (p == 0) {
            return "Si";
        } else return "No";
    }

    int dropnum(int a) {
        int emme = ((int) (Math.random() * 100) % a);
        return emme;
    }

    String Dropcarnagione() {
        int a = dropnum(5);
        if (a == 0) {
            return "Lattea";
        }
        if (a == 1) {
            return "Bianca";
        }
        if (a == 2) {
            return "Olivastra";
        }
        if (a == 3) {
            return "Mulatta";
        }
        if (a == 4) {
            return "Scura";
        }
        return "";
    }

    String Dropnaso() {
        int p = dropnum(5);
        if (p == 0) {
            return "Patata";
        }
        if (p == 1) {
            return "All'insu";
        }
        if (p == 2) {
            return "Aquilino";
        }
        if (p == 3) {
            return "A_Punta";
        }
        if (p == 4) {
            return "Lungo";
        }
        return "";
    }
    String Dropcolcap(){
       int p=dropnum(5);
        if (p == 0) {
            return "Rossi";
        }
        if (p == 1) {
            return "Biondi";
        }
        if (p == 2) {
            return "Castani";
        }
        if (p == 3) {
            return "Neri";
        }
        if (p == 4) {
            return "Bianchi";
        }
        return "";
    }
    String Droplungh(){
        int p=dropnum(3);
        if (p == 0) {
            return "Rasati";
        }
        if (p == 1) {
            return "Corti";
        }
        if (p == 2) {
            return "Lunghi";
        }
        else return "";
    }
    String DropColOcch()
    {
        int p=dropnum(4);
        if (p == 0) {
            return "Azzurri";
        }
        if (p == 1) {
            return "Castani";
        }
        if (p == 2) {
            return "Verdi";
        }
        if (p == 3) {
            return "Neri";
        }
        return "";
    }
    String Dropeta(){
        int p=dropnum(4);
        if (p == 0) {
            return "Bambino";
        }
        if (p == 1) {
            return "Ragazzo";
        }
        if (p == 2) {
            return "Adulto";
        }
        if (p == 3) {
            return "Anziano";
        }
        return "";
    }
    String tipocap(){
        int p=dropnum(3);
        if (p == 0) {
            return "Lisci";
        }
        if (p == 1) {
            return "Mossi";
        }
        if (p == 2) {
            return "Ricci";
        }
        else return "";
    }
    String getNaso(){
        if (Naso.length()>7)
            return Naso+"\t";
        else return Naso+"\t"+"\t";
    }

    String getOcchiali(){
        return occhiali;
    }
    String getBarba(){
        return barba;
    }
    String getBaffi(){
        return baffi;
    }
    String getOrecchini(){
        return orecchini;
    }
    String getNome(){
        if (nome.length()>7)
            return nome+"\t";
        else return nome+"\t"+"\t";
    }
    String getSesso(){return sesso;}

    String getCarnagione(){
        if (carnagione.length()>7)
            return carnagione+"\t";
        else return carnagione+"\t"+"\t";
    }
    String getColore_occhi(){
        if (colore_occhi.length()>7)
            return colore_occhi+"\t";
        else return colore_occhi+"\t"+"\t";
    }
    String getColore_capelli(){
    if (colore_capelli.length()>7)
        return colore_capelli+"\t";
    else return colore_capelli+"\t"+"\t";
    }
    String getCappello(){
        return cappello;
    }
    String getEta(){
        if (eta.length()>7)
            return eta+"\t";
        else return eta+"\t"+"\t";
    }
    String getLungh_capelli(){
        return lungh_capelli;
    }
    String getTipo_capelli(){
        return tipo_capelli;
    }
    String getEta1(){
        return eta;
    }
    String getColore_Capelli1(){
        return colore_capelli;
    } String getColore_occhi1(){
        return colore_occhi;
    }
    String getcarnagione1(){
        return carnagione;
    }
    String getnaso1(){
        return Naso;
    }
    String getnome1(){
        return nome;
    }
    String generalget(String s){
        if (s.equals("nome")) {
            return getnome1();
        }
        if (s=="sesso") {
            return getSesso();
        }
        if (s=="colore_capelli") {
            return getColore_Capelli1();
        }
        if (s=="carnagione") {
            return getcarnagione1();
        }
        if (s=="occhiali") {
            return getOcchiali();
        }
        if (s=="baffi") {
            return getBaffi();
        }
        if (s=="barba") {
            return getBarba();
        }
        if (s=="eta") {
            return getEta1();
        }
        if (s=="colore_occhi") {
            return getColore_occhi1();
        }
        if (s=="lunghezza_capelli") {
            return getLungh_capelli();
        }
        if (s=="tipo_capelli") {
            return getTipo_capelli();
        }
        if (s=="orecchini") {
            return getOrecchini();
        }
        if (s=="cappello"){
            return getCappello();
        }
        if (s=="naso"){
            return getnaso1();
        }
        else return "";

    }
    boolean domanda(String s, String c, Persona P_Daindovina){
        if (s.equals("nome")) {
             String m=P_Daindovina.getnome1();
             return c.equals(m);
        }
        if (s.equals("sesso")) {
            return c.equals(P_Daindovina.getSesso());
        }
        if (s.equals("colore_capelli")) {
            return c.equals(P_Daindovina.getColore_Capelli1());
        }
        if (s.equals("carnagione")) {
            return c.equals(P_Daindovina.getcarnagione1());
        }
        if (s.equals("occhiali")) {
            return c.equals(P_Daindovina.getOcchiali());
        }
        if (s.equals("baffi")) {
            return c.equals(P_Daindovina.getBaffi());
        }
        if (s.equals("barba")) {
            return c.equals(P_Daindovina.getBarba());
        }
        if (s.equals("eta")) {
            return c.equals(P_Daindovina.getEta1());
        }
        if (s.equals("colore_occhi")) {
            return c.equals(P_Daindovina.getColore_occhi1());
        }
        if (s.equals("lunghezza_capelli")) {
            return c.equals(P_Daindovina.getLungh_capelli());
        }
        if (s.equals("tipo_capelli")) {
            return c.equals(P_Daindovina.getTipo_capelli());
        }
        if (s.equals("orecchini")) {
            return c.equals(P_Daindovina.getOrecchini());
        }
        if (s.equals("cappello")){
            return c.equals(P_Daindovina.getCappello());
        }
        if (s.equals("naso")){
            return c.equals(P_Daindovina.getnaso1());
        }
        else return false;
    }
    void setNaso(String s){
        Naso=s;
    }
    void setNome(String s){
        nome=s;
    }
    void setEta(String s){
        eta=s;
    }
    void setCarnagione(String s){
        carnagione=s;
    }
    void setOrecchini(String s){
        orecchini=s;
    }
    void setSesso(String s){
        sesso=s;
    }
    void setTipo_capelli(String s){
      tipo_capelli=s;
    }
    void setLungh_capelli(String s){
        lungh_capelli=s;
    }
    void setOcchiali(String s){
        occhiali=s;
    }
    void setColore_capelli(String s){
        colore_capelli=s;
    }
    void setColore_occhi(String s){
        colore_occhi=s;
    }
    void setCappello(String s){
        cappello=s;
    }
    void setBaffi(String s){
        baffi=s;
    }
    void setBarba(String s){
        barba=s;
    }

    }

