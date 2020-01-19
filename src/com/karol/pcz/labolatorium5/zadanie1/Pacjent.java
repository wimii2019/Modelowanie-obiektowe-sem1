package com.karol.pcz.labolatorium5.zadanie1;

import java.util.Date;

public class Pacjent extends Osoba {
    String przebiegLeczenia;

    public Pacjent(String imie, String nazwisko, int wiek, Date dataUurodzenia, String adres) {
        super(imie, nazwisko, wiek, dataUurodzenia, adres);
    }

    @Override
    void wyswietl() {
        super.wyswietl();
        System.out.println(przebiegLeczenia);
    }
}
