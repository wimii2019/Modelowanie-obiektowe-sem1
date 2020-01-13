package com.karol.pcz.labolatorium4.zadanie5;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Garaz {

    private Samochod[] samochody;
    private int iloscMiejsc = 3;
    private int pozycja = 0;

    public Garaz() {
        samochody = new Samochod[3];
    }

    public Garaz(int iloscMiejscWGarazu) {
        iloscMiejsc = iloscMiejscWGarazu;
        samochody = new Samochod[iloscMiejsc];
    }

    public void wprowadz(Samochod samochod) {
        if (pozycja + 1 >= iloscMiejsc) {
            throw new ArrayIndexOutOfBoundsException("Nie można wprowadzić auta, brak miejsc");
        } else {
            samochody[pozycja] = samochod;
            pozycja = pozycja + 1;
        }
    }

    public Samochod wyprowadz(){
        if (pozycja<=0){
            throw new NullPointerException("Brak samochodu do wyprowadzenia");
        }
        else {
            Samochod samochod = samochody[pozycja];
            samochody[pozycja]=null;
            if(pozycja>0){
                pozycja = pozycja - 1;
            }
            return samochod;
        }
    }

    public void wyswietl(){
        Arrays.asList(samochody).forEach(Samochod::wyswietl);
    }

    public int liczbaWolnych(){
        return iloscMiejsc - (pozycja+1);
    }

    public boolean szukaj(String marka){
       return Arrays
               .asList(samochody)
               .stream()
               .filter(samochod -> marka.equals(samochod.getMarka()))
               .collect(Collectors.toList())
               .size()>0;
    }


}
