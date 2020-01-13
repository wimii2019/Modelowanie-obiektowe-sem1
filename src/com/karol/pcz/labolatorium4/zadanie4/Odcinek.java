package com.karol.pcz.labolatorium4.zadanie4;

public class Odcinek {

    private Punkt p1;
    private Punkt p2;

    public Odcinek(Punkt p1, Punkt p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Odcinek(int x1, int y1, int x2,int y2) {
        this.p1 = new Punkt(x1,y1);
        this.p2 = new Punkt(x2,y2);
    }

    public Punkt getP1() {
        return p1;
    }

    public void setP1(Punkt p1) {
        this.p1 = p1;
    }

    public Punkt getP2() {
        return p2;
    }

    public void setP2(Punkt p2) {
        this.p2 = p2;
    }

    public int dlugosc() {
        double pow1 = Math.pow((double) (p2.getX() - p1.getX()), 2);
        double pow2 = Math.pow((double)(p2.getX()-p1.getX()),2);
        return (int) Math.sqrt(pow1+pow2);
    }

    public Punkt srodek() {
        int x = (p1.getX()+p2.getX())/2;
        int y = (p1.getY()+p2.getY())/2;
        return new Punkt(x,y);
    }

    public void setP2(int x, int y) {
        p2.setX(x);
        p2.setY(y);
    }

    public void setP1(int x, int y) {
        p1.setX(x);
        p1.setY(y);
    }
}
