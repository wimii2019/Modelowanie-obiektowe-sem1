package com.karol.pcz.labolatorium4.zadanie3;

public class Osoba {

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    private String imie;
    private String nazwisko;

    public Osoba(Osoba osoba) {
        this.imie = osoba.getImie();
        this.nazwisko = osoba.getNazwisko();
    }

    public Osoba() {
        this.imie = "domyślne imie";
        this.nazwisko = "domyślne nazwisko";
    }


    public void wyswietl() {
        System.out.println( "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}');
    }

    public static void main(String[] args) {
        Osoba os = new Osoba();
        os.wyswietl();
        os.setImie("Jan");
        os.setNazwisko("Nowakowski");
        os.wyswietl();
        Osoba os2 = new Osoba(os);
        os2.wyswietl();

    }
}
