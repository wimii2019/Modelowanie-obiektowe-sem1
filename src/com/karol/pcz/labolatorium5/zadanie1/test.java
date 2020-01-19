package com.karol.pcz.labolatorium5.zadanie1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class test {


    public static void main(String[] args) {

        Lekarz l1 = new Lekarz("Jan", "Kowalski", 50, new Date(1970, 01, 19), "Częstochowa ul. Dąbrowskiego");

        Osoba o1 = new Lekarz("Jan", "Nowak", 60, new Date(1960, 01, 19), "Częstochowa ul. Dąbrowskiego");

        Osoba o2 = new Pacjent("Jan", "Kowalski", 70, new Date(1950, 01, 19), "Częstochowa ul. Dąbrowskiego");

        Osoba o3 = new Pielegniarka("Jan", "Kowalski", 70, new Date(1950, 01, 19), "Częstochowa ul. Dąbrowskiego");

        List<Osoba> listaOsob = new ArrayList<>();
        listaOsob.add(l1);
        listaOsob.add(o1);
        listaOsob.add(o2);
        listaOsob.add(o3);
        ((Pielegniarka) o3).dyzury = new String[5];
        ((Pielegniarka) o3).dyzury[1] ="xyz";

        listaOsob.forEach(Osoba::wyswietl);
    }
}
