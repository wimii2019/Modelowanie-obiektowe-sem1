package com.karol.pcz.labolatorium5.zadanie3;

import java.util.List;

public class Ksiazka extends Pozycja {
    int strony;

    public Ksiazka(long id,String tytul, List<Autor> listaAutorow, String wydawnictwo, int rokWydania, int strony) {
        super(id,tytul, listaAutorow, wydawnictwo, rokWydania);
        this.strony=strony;
    }

    @Override
    void wypiszInfo() {
        super.wypiszInfo();
        System.out.println(String.format("Strony= %s",strony));
    }
}
