package com.karol.pcz.labolatorium5.zadanie3;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        Biblioteka biblioteka = new Biblioteka("Częstochowa u;. Dąbrowskiego");

        ArrayList<Autor> listaAutorow = new ArrayList<>();
        Autor e = new Autor("Adam", "Mickiewicz", "Polak");
        listaAutorow.add(e);
        biblioteka.dodajPozycje(new Ksiazka(1,"Pan Tadeusz", listaAutorow,"PWN",2010,290));
        biblioteka.wysukajPoNazwisku(e).forEach(d-> System.out.println(d));



    }
}
