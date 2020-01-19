package com.karol.pcz.labolatorium5.zadanie2;

public class Kwadrat implements Figura {

    private double bok = 0.0;

    public Kwadrat(double bok) {
        this.bok = bok;
    }

    @Override
    public void wyswietl() {
        System.out.println(String.format("Kwadrat: bok=%s",bok));
    }

    @Override
    public double obliczObwod() {
        return bok*4;
    }

    @Override
    public double obliczPole() {
        return bok*bok;
    }
}
