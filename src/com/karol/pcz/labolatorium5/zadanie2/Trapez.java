package com.karol.pcz.labolatorium5.zadanie2;

public class Trapez implements Figura {

    private double AB = 0.0;
    private double BC = 0.0;
    private double CD = 0.0;
    private double DA = 0.0;
    private double h = 0.0;

    public Trapez(double AB, double BC, double CD, double DA, double h) {
        this.AB = AB;
        this.BC = BC;
        this.CD = CD;
        this.DA = DA;
        this.h = h;
    }

    @Override
    public void wyswietl() {
        System.out.println(String.format("Trapez: AB=%s BC=%s CD=%s DA=%s h=%s",AB,BC,CD,DA,h));
    }

    @Override
    public double obliczObwod() {
        return AB+BC+CD+DA;
    }

    @Override
    public double obliczPole() {
        return 0.5*(AB+CD)*h;
    }
}
