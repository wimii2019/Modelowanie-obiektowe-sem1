package com.karol.pcz.labolatorium5.zadanie2;

public class Kolo implements Figura {

    private double r=0.0;

    public Kolo(double r) {
        this.r = r;
    }

    @Override
    public void wyswietl() {
        System.out.println(String.format("Koło: promień=%s",r));
    }

    @Override
    public double obliczObwod() {
        return 2* Math.PI *r;
    }

    @Override
    public double obliczPole() {
        return Math.PI * (r*r);
    }
}
