package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public  class Scrvifile {
    static void Scrvifile(ArrayList <Persona> pers, String s, Persona p1, int m, String nome) throws IOException {
        FileWriter w;
        w = new FileWriter(s);
        BufferedWriter b;
        b = new BufferedWriter(w);
        b.append("Nome player: "  + nome +"\nSesso\t\tNome\t\tEta\t\tCappello\tCarnagione\tColore_Capelli\tColore_Occhi\tLunghe_capelli\tTipo_Capelli\tOcchiali\tNaso\t\tBaffi\t\tBarba\t\tOrecchini\n\n\n");
        for (int i = 1; i < pers.size(); i++) {
            b.append(pers.get(i).getSesso() + "\t\t" + pers.get(i).getNome() + "" + pers.get(i).getEta() + "" + pers.get(i).getCappello() + "\t\t" + pers.get(i).getCarnagione() + "" + pers.get(i).getColore_capelli() + "" + pers.get(i).getColore_occhi() + "" + pers.get(i).getLungh_capelli() + "\t\t" + pers.get(i).getTipo_capelli() + "\t\t" + pers.get(i).getOcchiali() + "\t\t" + pers.get(i).getNaso() + "" + pers.get(i).getBaffi() + "\t\t" + pers.get(i).getBarba() + "\t\t" + pers.get(i).getOrecchini() + "\n");
        }
        b.append("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        b.append(p1.getSesso() + "\t\t" + p1.getNome() + "" + p1.getEta() + "" + p1.getCappello() + "\t\t" + p1.getCarnagione() + "" + p1.getColore_capelli() + "" + p1.getColore_occhi() + "" + p1.getLungh_capelli() + "\t\t" + p1.getTipo_capelli() + "\t\t" + p1.getOcchiali() + "\t\t" + p1.getNaso() + "" + p1.getBaffi() + "\t\t" + p1.getBarba() + "\t\t" + p1.getOrecchini() + "\n");
        b.flush();
        w.close();
    }
    static Boolean Interpreta(Tavolo T, String Caratt, String bul,int i){
        if (Caratt.equals("occhiali")){
            if (T.pers.get(i).getOcchiali().equals(bul)){
                return true;
            }
        }if (Caratt.equals("naso")){
            if (T.pers.get(i).getnaso1().equals(bul)){
                return true;
            }
        }if (Caratt.equals("sesso")){
            if (T.pers.get(i).getSesso().equals(bul)){
                return true;
            }
        }if (Caratt.equals("baffi")){
            if (T.pers.get(i).getBaffi().equals(bul)){
                return true;
            }
        }if (Caratt.equals("barba")){
            if (T.pers.get(i).getBarba().equals(bul)){
                return true;
            }
        }if (Caratt.equals("tipo_capelli")){
            if (T.pers.get(i).getTipo_capelli().equals(bul)){
                return true;
            }
        }if (Caratt.equals("lunghezza_capelli")){
            if (T.pers.get(i).getLungh_capelli().equals(bul)){
                return true;
            }
        }if (Caratt.equals("cappello")){
            if (T.pers.get(i).getCappello().equals(bul)){
                return true;
            }
        }if (Caratt.equals("carnagione")){
            if (T.pers.get(i).getcarnagione1().equals(bul)){
                return true;
            }
        }if (Caratt.equals("nome")){
            if (T.pers.get(i).getnome1().equals(bul)){
                return true;
            }
        }if (Caratt.equals("eta")){
            if (T.pers.get(i).getEta1().equals(bul)){
                return true;
            }
        }if (Caratt.equals("colore_occhi")){
            if (T.pers.get(i).getColore_occhi1().equals(bul)){
                return true;
            }
        }if (Caratt.equals("colore_capelli")){
            if (T.pers.get(i).getColore_Capelli1().equals(bul)){
                return true;
            }
        }
        if (Caratt.equals("orecchini")){
            if (T.pers.get(i).getOrecchini().equals(bul)){
                return true;
            }
        }
        return false;
    }

    static String finddomande(){
        int emme = ((int) (Math.random() * 100) % 14);
        if (emme==0){return "sesso";}
        if (emme==1){return "nome";}
        if (emme==2){return "carnagione";}
        if (emme==3){return "eta";}
        if (emme==4){return "cappello";}
        if (emme==5){return "colore_occhi";}
        if (emme==6){return "colore_capelli";}
        if (emme==7){return "tipo_capelli";}
        if (emme==8){return "lunghezza_capelli";}
        if (emme==9){return "barba";}
        if (emme==10){return "baffi";}
        if (emme==11){return "orecchini";}
        if (emme==12){return "occhiali";}
        if (emme==13){return "naso";}
        return null;
    }

    static String finddomande2(String a){
        int m=0;
        if (a.equals("sesso"))
            {int emme = ((int) (Math.random() * 100) % 2);
                if (emme==0){m=1;return "M";}
                if (emme==1){m=2;return "F";}
                return null; }

        if (a.equals("nome"))
        {int emme = ((int) (Math.random() * 100) % 15);
            if ((emme==0)&&(m==1)){return "Michele";}
            if ((emme==0)&&(m==2)){return "Krizia";}
            if ((emme==1)&&(m==1)){return "Luigi";}
            if ((emme==1)&&(m==2)){return "Alisia";}
            if ((emme==2)&&(m==1)){return "Marco";}
            if ((emme==2)&&(m==2)){return "Paola";}
            if ((emme==3)&&(m==1)){return "Rufino";}
            if ((emme==3)&&(m==2)){return "Raffaella";}
            if ((emme==4)&&(m==1)){return "Umberto";}
            if ((emme==4)&&(m==2)){return "Lorena";}
            if ((emme==5)&&(m==1)){return "Lorenzo";}
            if ((emme==5)&&(m==2)){return "Maria";}
            if ((emme==6)&&(m==1)){return "Giuseppe";}
            if ((emme==6)&&(m==2)){return "Giusy";}
            if ((emme==7)&&(m==1)){return "Domenico";}
            if ((emme==7)&&(m==2)){return "Micol";}
            if ((emme==8)&&(m==1)){return "Nello";}
            if ((emme==8)&&(m==2)){return "Ilaria";}
            if ((emme==9)&&(m==1)){return "Pietro";}
            if ((emme==9)&&(m==2)){return "Francesca";}
            if ((emme==10)&&(m==1)){return "Emanuele";}
            if ((emme==10)&&(m==2)){return "Elena";}
            if ((emme==11)&&(m==1)){return "Luca";}
            if ((emme==11)&&(m==2)){return "Giorgia";}
            if ((emme==12)&&(m==1)){return "Stefano";}
            if ((emme==12)&&(m==2)){return "Sabrina";}
            if ((emme==13)&&(m==1)){return "Vincenzo";}
            if ((emme==13)&&(m==2)){return "Lina";}
            if ((emme==14)&&(m==1)){return "Valerio";}
            if ((emme==14)&&(m==2)){return "Giuliana";}
            return null; }

        if (a.equals("carnagione"))
        {int emme = ((int) (Math.random() * 100) % 5);
            if ((emme==0)){return "Lattea";}
            if ((emme==1)){return "Bianca";}
            if ((emme==2)){return "Olivastra";}
            if ((emme==3)){return "Mulatta";}
            if ((emme==4)){return "Scura";}}





        if (a.equals("eta"))
        {int emme = ((int) (Math.random() * 100) % 4);
            if ((emme==0)){return "Bambino";}
            if ((emme==1)){return "Ragazzo";}
            if ((emme==2)){return "Adulto";}
            if ((emme==3)){return "Anziano";} }

        if (a.equals("barba"))
        {int emme = ((int) (Math.random() * 100) % 2);
            if ((emme==0)){return "Si";}
            if ((emme==1)){return "No";}}

        if (a.equals("baffi"))
        {int emme = ((int) (Math.random() * 100) % 2);
            if ((emme==0)){return "Si";}
            if ((emme==1)){return "No";}}

        if (a.equals("orecchini"))
        {int emme = ((int) (Math.random() * 100) % 2);
            if ((emme==0)){return "Si";}
            if ((emme==1)){return "No";}}

        if (a.equals("occhiali"))
        {int emme = ((int) (Math.random() * 100) % 2);
            if ((emme==0)){return "Si";}
            if ((emme==1)){return "No";}}

        if (a.equals("colore_occhi"))
        {int emme = ((int) (Math.random() * 100) % 4);
            if ((emme==0)){return "Castani";}
            if ((emme==1)){return "Azzurri";}
            if ((emme==2)){return "Verdi";}
            if ((emme==3)){return "Neri";}
        }


        if (a.equals("colore_capelli"))
        {int emme = ((int) (Math.random() * 100) % 5);
            if ((emme==0)){return "Rossi";}
            if ((emme==1)){return "Biondi";}
            if ((emme==2)){return "Castani";}
            if ((emme==3)){return "Bianchi";}
            if ((emme==4)){return "Neri";}
        }

        if (a.equals("naso"))
        {int emme = ((int) (Math.random() * 100) % 5);
            if ((emme==0)){return "All'insu";}
            if ((emme==1)){return "A_Punta";}
            if ((emme==2)){return "Patata";}
            if ((emme==3)){return "Aquilino";}
            if ((emme==4)){return "Lungo";}
        }

        if (a.equals("lunghezza_capelli")){
        {int emme = ((int) (Math.random() * 100) % 3);
            if ((emme==0)){return "Lunghi";}
            if ((emme==1)){return "Corti";}
            if ((emme==2)){return "Rasati";}
        }}

        if (a.equals("tipo_capelli")){int emme = ((int) (Math.random() * 100) % 3);
            if ((emme==0)){return "Lisci";}
            if ((emme==1)){return "Mossi";}
            if ((emme==2)){return "Ricci";}
        }

        if (a.equals("cappello"))
        {int emme = ((int) (Math.random() * 100) % 2);
            if ((emme==0)){return "Si";}
            if ((emme==1)){return "No";}}

 return null;}

}
