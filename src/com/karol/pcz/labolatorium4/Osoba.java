package com.karol.pcz.labolatorium4;


public class Osoba {

    private String getImie() {
        return imie;
    }

    private void setImie(String imie) {
        this.imie = imie;
    }

    private String getNazwisko() {
        return nazwisko;
    }

    private void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    private String imie;
    private String nazwisko;

    public static void main(String[] args) {
        System.out.println("zadanie1");
        Osoba osoba = new Osoba();
        System.out.println(osoba.getImie());
        System.out.println(osoba.getNazwisko());
        osoba.setImie("Jan");
        osoba.setNazwisko("Kowalski");
        System.out.println(osoba.getImie());
        System.out.println(osoba.getNazwisko());
    }

}
