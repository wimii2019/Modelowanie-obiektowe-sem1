package com.karol.pcz.labolatorium5.zadanie3;

import java.util.ArrayList;
import java.util.List;

public abstract class Pozycja {

    final long id;
    String tytul;
    List<Autor> listaAutorow;
    String wydawnictwo;
    int rokWydania;

    public Pozycja(long id, String tytul, List<Autor> listaAutorow, String wydawnictwo, int rokWydania) {
        this.id = id;
        this.tytul = tytul;
        this.listaAutorow = new ArrayList<>();
        this.listaAutorow.addAll(listaAutorow);
        this.wydawnictwo = wydawnictwo;
        this.rokWydania = rokWydania;
    }

    void wypiszInfo(){
        System.out.println(String.format("Pozycja: id=%s lista Autorow=%s wydawnictwo=%s rok wydania=%s",id,listaAutorow,wydawnictwo,rokWydania));
    }
}
