package com.karol.pcz.labolatorium5.zadanie1;

import java.util.Date;

public abstract class Osoba {
        String imie, nazwisko;
        int wiek;
        Date dataUurodzenia;
        String adres;

    public Osoba(String imie, String nazwisko, int wiek, Date dataUurodzenia, String adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.dataUurodzenia = dataUurodzenia;
        this.adres = adres;
    }
    void wyswietl(){

    };
}
