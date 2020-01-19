package com.karol.pcz.labolatorium5.zadanie2;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Figura> figury = new ArrayList<>();
        figury.add(new Kolo(5.5));
        figury.add(new Kwadrat(5));
        figury.add(new Prostokat(5,10));
        figury.add(new Trapez(5,6,10,7,5.5));
        figury.add(new Trojkat(4,5,6,5.5));

        for (Figura figura : figury) {
            figura.wyswietl();
            System.out.println(figura.obliczObwod());
            System.out.println(figura.obliczPole());
            System.out.println("");
        }
    }
}
