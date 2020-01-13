package com.karol.pcz.labolatorium4.zadanie4;

public class Punkt {

    private int x;
    private  int y;

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void wyswietl() {
        System.out.println(String.format("x=%s y=%s",x,y));
    }
}
