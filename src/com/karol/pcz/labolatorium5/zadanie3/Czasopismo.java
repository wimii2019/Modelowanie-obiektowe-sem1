package com.karol.pcz.labolatorium5.zadanie3;

import java.util.List;

public class Czasopismo extends Pozycja {
    int numer;
    String streszczenie;

    public Czasopismo(long id, String tytul, List<Autor> listaAutorow, String wydawnictwo, int rokWydania, int numer, String streszczenie) {
        super(id, tytul, listaAutorow, wydawnictwo, rokWydania);
        this.numer=numer;
        this.streszczenie=streszczenie;
    }

    @Override
    void wypiszInfo() {
        super.wypiszInfo();
        System.out.println(String.format("Numer:%s Streszczenie: %s",numer,streszczenie));
    }
}
