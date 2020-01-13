package com.karol.pcz.labolatorium4.zadanie5;

public class Samochod {
    private String marka;
    private String model;
    private int moc;
    private int pojemnosc;
    private int rokProdukcji;

    public Samochod(String marka, String model, int moc, int pojemnosc, int rokProdukcji) {
        this.marka = marka;
        this.model = model;
        this.moc = moc;
        this.pojemnosc = pojemnosc;
        this.rokProdukcji = rokProdukcji;
    }


    public void wyswietl() {
        System.out.println("Samochod{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", moc=" + moc +
                ", pojemnosc=" + pojemnosc +
                ", rokProdukcji=" + rokProdukcji +
                '}');
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMoc() {
        return moc;
    }

    public void setMoc(int moc) {
        this.moc = moc;
    }

    public int getPojemnosc() {
        return pojemnosc;
    }

    public void setPojemnosc(int pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }
}
