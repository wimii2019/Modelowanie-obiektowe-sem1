package com.karol.pcz.labolatorium5.zadanie2;

public class Trojkat implements Figura{

    private double AB = 0.0;
    private double BC = 0.0;
    private double AC = 0.0;
    private double h = 0.0;

    public Trojkat(double AB, double BC, double AC, double h) {
        this.AB = AB;
        this.BC = BC;
        this.AC = AC;
        this.h = h;
    }

    @Override
    public void wyswietl() {
        System.out.println(String.format("Trojkat: AB=%s BC=%s AC=%s h=%s",AB,BC,AC,h));
    }

    @Override
    public double obliczObwod() {
        return AB+AC+BC;
    }

    @Override
    public double obliczPole() {
        return 0.5*AB*h;
    }
}
