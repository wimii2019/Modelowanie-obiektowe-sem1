package com.karol.pcz.laboratorium2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class MainLab2 {

    public static void main(String[] args) {

        System.err.println("Zadanie 1");
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println(currentTime);

        LocalDateTime brazilTime = LocalDateTime.now(ZoneId.of("Brazil/East"));

        System.out.println(brazilTime);

        int hoursDiff = currentTime.getHour() - brazilTime.getHour();

        System.out.println(String.format("Hours gap %s", hoursDiff));
        System.err.println("Zadanie 2");

        LocalDateTime australia = LocalDateTime.now(ZoneId.of("Australia/Sydney"));
        LocalDateTime asia = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime america = LocalDateTime.now(ZoneId.of("America/Phoenix"));
        LocalDateTime la = LocalDateTime.now(ZoneId.of("America/Los_Angeles"));
        LocalDateTime pacific = LocalDateTime.now(ZoneId.of("Pacific/Guadalcanal"));

        wyswietlRoznice(australia);
        wyswietlRoznice(asia);
        wyswietlRoznice(america);
        wyswietlRoznice(la);
        wyswietlRoznice(pacific);
        System.err.println("Zadanie 3");
        wyswietlDateWFormacie();
        System.err.println("Zadanie 4");
        wyswietlCzasIUstawDate();
        System.err.println("Zadanie 5");
        System.out.println(czyLocalTimeJestZgodnyZAustraliaDarwin());
        System.err.println("Zadanie 6");
        System.out.println(czyMlodszaJestKolkataCzyYerevan());

    }

    private static void wyswietlRoznice(LocalDateTime lc) {
        System.out.println(LocalDateTime.now().getHour() - lc.getHour());
    }

    private static void wyswietlDateWFormacie() {
        System.out.println(LocalDate.now().format(DateTimeFormatter.ISO_DATE));
    }

    private static void wyswietlCzasIUstawDate() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDateTime localDateTime1 = localDateTime.withYear(2020).withMonth(1).withDayOfMonth(1);
        System.out.println(localDateTime1);
    }

    private static boolean czyLocalTimeJestZgodnyZAustraliaDarwin() {
        LocalDateTime australia = LocalDateTime.now(ZoneId.of("Australia/Sydney"));
        LocalDateTime currentTime = LocalDateTime.now();
        return australia.isEqual(currentTime);
    }

    private static String czyMlodszaJestKolkataCzyYerevan() {
        LocalDateTime yerevan = LocalDateTime.now(ZoneId.of("Asia/Yerevan"));
        LocalDateTime kolkata = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));

        if (yerevan.isEqual(kolkata)) {
            return "Są takie same";
        } else if (yerevan.isAfter(kolkata)) {
            return "Kolkata ma młodszą godzinę";
        } else {
            return "Yerevan ma młodszą godzinę";
        }


    }

}
