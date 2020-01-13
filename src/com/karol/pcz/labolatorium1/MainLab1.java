package com.karol.pcz.labolatorium1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class MainLab1 {

    public static void main(String[] args) {
        //zadanie2();
        //zadanie3();
        //zadanie4();
        //zadanie5();
        //zadanie6();
        //zadanie7();
        //zadanie8();
        //zadanie9();
        //zadanie10();
        //zadanie11();
        //zadanie12();
        //zadanie13();
        zadanie14();
    }

    private static void zadanie2() {
        int variable = 10;
        double variable2 = 3.1459;
        char variable3 = 'Z';
        boolean variable4 = true;
        System.out.println(variable);
        System.out.println(variable2);
        System.out.println(variable3);
        System.out.println(variable4);
    }

    private static void zadanie3() {
        System.out.println("Podaj imię");
        System.out.println(String.format("Cześć %s!", new Scanner(System.in).next()));
    }

    private static void zadanie4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą");
        int i = scanner.nextInt();
        System.out.println("Podaj liczbę naturalną");
        double v = scanner.nextDouble();
        System.out.println(String.format("Liczba całkowita: %s", i));
        System.out.println(String.format("Liczba naturalna: %s", v));
    }

    private static void zadanie5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę zmiennoprzecinkową");
        double v1 = scanner.nextDouble();
        System.out.println("Podaj drugą liczbę zmiennoprzecinkową");
        double v2 = scanner.nextDouble();
        System.out.println(String.format("Suma to: %s", (v1 + v2)));
    }

    private static void zadanie6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        double v1 = scanner.nextDouble();
        System.out.println("Podaj drugą liczbę");
        double v2 = scanner.nextDouble();
        System.out.println("Podaj trzecią liczbę");
        double v3 = scanner.nextDouble();
        if (v1 < v2 && v1 < v3) {
            System.out.println(String.format("Najmiejszy element to: %s", v1));
        } else if (v2 < v1 && v2 < v3) {
            System.out.println(String.format("Najmiejszy element to: %s", v2));
        } else {
            System.out.println(String.format("Najmiejszy element to: %s", v2));
        }
    }

    private static void zadanie7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        double v1 = scanner.nextDouble();
        System.out.println("Podaj drugą liczbę");
        double v2 = scanner.nextDouble();

        if ((v1 + v2) % 2 == 0) {
            System.out.println("Suma jest parzysta");
        } else {
            System.out.println("Suma jest nieparzysta");
        }
    }

    private static void zadanie8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj koniec przedziału");
        int end = scanner.nextInt();
        IntStream.range(0, end + 1).forEach(value -> System.out.println(value));
    }

    private static void zadanie9() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj start przedziału");
        int start = scanner.nextInt();
        System.out.println("Podaj koniec przedziału");
        int end = scanner.nextInt();
        IntStream.range(start, end + 1).forEach(value -> System.out.println(value));
    }

    private static void zadanie10() {
        AtomicInteger wynik = new AtomicInteger();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj start przedziału");
        int start = scanner.nextInt();
        System.out.println("Podaj koniec przedziału");
        int end = scanner.nextInt();
        IntStream.range(start, end + 1).forEach(value -> {
            if (value % 3 == 0) {
                wynik.addAndGet(value);
            }
        });
        System.out.println(String.format("Suma liczb podzielnych przez 3 to: %s", wynik.toString()));
    }

    private static void zadanie11() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ciąg znaków");
        String input = scanner.next();
        if (input.toLowerCase().indexOf("a") != -1) {
            System.out.println("Ciąg zawiera literę a ");
        } else {
            System.out.println("Ciąg nie zawiera literę a ");
        }
    }

    private static void zadanie12() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ciąg znaków");
        String input = scanner.nextLine();
        System.out.println(input.substring(input.indexOf(" "), input.lastIndexOf(" ")));
    }

    private static void zadanie13() {
        String s1 = "kot";
        String s2 = "kot";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }

    private static void zadanie14() {
        ArrayList<String> opisy = new ArrayList<>();
        opisy.add("Kalkulator");
        opisy.add("1 dodawanie");
        opisy.add("2 odejmowanie");
        opisy.add("3 mnożenie");
        opisy.add("4 dzielenie");
        opisy.add("exit Wyjście");

        opisy.forEach(value -> System.out.println(value));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj opcję");

        String s = scanner.next();
        if (s.equals("exit")) {
            System.out.println("Koniec działania programu");
            return;
        } else if (Integer.parseInt(s) >= 1 && Integer.parseInt(s) <= 4) {
            System.out.println("Podaj pierwszą liczbę");
            double v1 = scanner.nextDouble();
            System.out.println("Podaj drugą liczbę");
            double v2 = scanner.nextDouble();
            switch (s) {
                case "1":
                    System.out.println(String.format("Wynik dodawania: %s", (v1 + v2)));
                    break;
                case "2":
                    System.out.println(String.format("Wynik odejmowania: %s", (v1 - v2)));
                    break;
                case "3":
                    System.out.println(String.format("Wynik mnożenia: %s", (v1 * v2)));
                    break;
                case "4":
                    System.out.println(String.format("Wynik dzielenia: %s", (v1 / v2)));
                    break;
            }
        } else {
            System.out.println("Nieprawidłowy parametr");
        }
    }
}
