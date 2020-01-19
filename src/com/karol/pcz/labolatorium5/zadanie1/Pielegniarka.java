package com.karol.pcz.labolatorium5.zadanie1;

import java.util.Arrays;
import java.util.Date;

public class Pielegniarka extends Osoba {
    String[] dyzury;
    double pensja;
    int nadgodziny;
    int[] opiekaSal;

    public Pielegniarka(String imie, String nazwisko, int wiek, Date dataUurodzenia, String adres) {
        super(imie, nazwisko, wiek, dataUurodzenia, adres);
    }

    @Override
    void wyswietl() {
        super.wyswietl();
        System.out.println(Arrays.asList(dyzury).toString() + ' ' + pensja + ' ' + nadgodziny + ' ' + Arrays.asList(opiekaSal).toString());
    }
}