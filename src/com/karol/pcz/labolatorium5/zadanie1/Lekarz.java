package com.karol.pcz.labolatorium5.zadanie1;

import java.util.Date;

public class Lekarz extends Osoba {
    String specjalizacja;
    String[] operacje;
    double pensja;
    double premia;

    public Lekarz(String imie, String nazwisko, int wiek, Date dataUurodzenia, String adres) {
        super(imie, nazwisko, wiek, dataUurodzenia, adres);
    }
    @Override
    void wyswietl() {
        super.wyswietl();
        System.out.print(specjalizacja + ' ' +operacje + ' ' + wiek +' '+pensja +' '+premia);
    }
}

