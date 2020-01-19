package com.karol.pcz.labolatorium5.zadanie3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Biblioteka {


    private List<Pozycja> pozycje = new ArrayList<>();
    String adres;

    public Biblioteka(String adres) {
        this.adres = adres;
    }

    public void wystwietlInformacjeOWszystkichKsiazkach(){
        pozycje.forEach(e-> {
            if (e instanceof Ksiazka){
                e.wypiszInfo();
            }
        });
    }

    public void dodajPozycje(Pozycja pozycja){
        pozycje.add(pozycja);
    }

    public void usunKsiazke(Pozycja pozycja){
        pozycje.remove(pozycja);
    }

    public Pozycja wysukajPoID(long id){
        return pozycje.stream().filter(pozycja -> pozycja.id==id).findFirst().get();
    }
    public List<Pozycja> wysukajPoNazwisku(Autor autor){
        return pozycje.stream().filter(pozycja -> pozycja
                .listaAutorow
                .stream()
                .filter(autor1 -> autor1.equals(autor)).count()!=0).collect(Collectors.toList());
    }
    public List<Pozycja> wysukajPoID(int rokWydania){
        return pozycje.stream().filter(pozycja -> pozycja.rokWydania==rokWydania).collect(Collectors.toList());
    }
}
