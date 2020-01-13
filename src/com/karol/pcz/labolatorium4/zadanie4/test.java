package com.karol.pcz.labolatorium4.zadanie4;

public class test {

    public static void main(String[] args) {
        Punkt p1 = new Punkt(-2, 3);
        Punkt p2 = new Punkt(4, 6);
        Odcinek o1 = new Odcinek(p1, p2);
        System.out.print("Dlugosc: " + o1.dlugosc() + "\n");
        Odcinek o2 = new Odcinek(-5, 2, 1, 6);
        System.out.print("Dlugosc: " + o2.dlugosc() + "\n");
        o2.setP2(0,10);
        System.out.print("Dlugosc: " + o2.dlugosc() + "\n");
        o1.setP1(-2, 3);
        o1.setP2(4,-9);
        Punkt srodek = o1.srodek();
        srodek.wyswietl();
    }
}
