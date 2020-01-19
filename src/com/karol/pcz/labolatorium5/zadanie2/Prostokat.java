package com.karol.pcz.labolatorium5.zadanie2;

public class Prostokat implements Figura {

    private double bokA = 0.0;
    private double bokB = 0.0;

    public Prostokat(double bokA, double bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    @Override
    public void wyswietl() {
        System.out.println(String.format("Prostokat: Bok A=%s Bok B=%s",bokA,bokB));
    }

    @Override
    public double obliczObwod() {
        return (2*bokA)+(2*bokB);
    }

    @Override
    public double obliczPole() {
        return bokA*bokB;
    }
}
