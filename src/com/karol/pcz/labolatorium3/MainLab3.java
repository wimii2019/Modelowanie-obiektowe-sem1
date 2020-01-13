package com.karol.pcz.labolatorium3;

import java.util.*;

public class MainLab3 {


    public static void main(String[] args) {

        //zadanie1();
        //zadanie2();
        //zadanie3();
        //zadanie4();
        //zadanie5();
        //zadanie6();
        //zadanie7();
        //System.out.println("zadanie 8");
        //getNumberOfSeconds(5);
        //getNumberOfSeconds(0);
        //zadanie9();
        zadanie10();
    }

    private static void zadanie1() {

        int[] tab = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println(String.format("Podaj liczbę: %s", i + 1));
            Scanner in = new Scanner(System.in);
            int input = in.nextInt();
            System.out.println(String.format("Wczytano: %s", input));
            tab[i] = input;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(String.format("tab[%s] = %s", i, tab[i]));
        }
    }

    private static void zadanie2() {
        System.out.println("Podaj rozmiar tablicy");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        double[] tab = new double[input];
        Random generator = new Random();
        for (int i = 0; i < input; i++) {
            tab[i] = generator.nextDouble() * 10;
        }
        double suma = 0.0;
        for (int i = 0; i < input; i++) {
            suma += tab[i];
        }
        System.out.println(String.format("średnia z losowania to: %s", (suma / input)));
    }

    private static void zadanie3() {
        System.out.println("Podaj rozmiar tablicy");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int[] tab = new int[input];
        Random generator = new Random();
        for (int i = 0; i < input; i++) {
            tab[i] = generator.nextInt(50);
        }
        int suma = 0;
        for (int i = 0; i < input; i++) {
            if (tab[i] % 2 == 0) {
                suma += tab[i];
            }
        }
        System.out.println(String.format("suma liczb parzystych to: %s", suma));
    }

    private static void zadanie4() {
        System.out.println("Podaj rozmiar tablicy");
        int input = 60;
        int[] tab = new int[input];
        Random generator = new Random();
        for (int i = 0; i < input; i++) {
            tab[i] = generator.nextInt(50);
        }
        int suma = 0;
        for (int i = 0; i < input; i++) {
            if (i % 3 == 0) {
                suma += tab[i];
            }
        }
        System.out.println(String.format("suma co 3 elementu to: %s", suma));
    }

    private static void zadanie5() {
        System.out.println("Podaj rozmiar tablic");
        Scanner in = new Scanner(System.in);
        int wielkosc = in.nextInt();
        System.out.println(String.format("Podano rozmiar tablicy: %s", wielkosc));
        int[] tab1 = new int[wielkosc];
        int[] tab2 = new int[wielkosc];
        int wynik = 0;

        for (int i = 0; i < wielkosc; i++) {
            System.out.println(String.format("Podaj %s element pierwszej tablicy", i + 1));
            Scanner temp = new Scanner(System.in);
            tab1[i] = temp.nextInt();
        }

        for (int i = 0; i < wielkosc; i++) {
            System.out.println(String.format("Podaj %s element drugiej tablicy", i + 1));
            Scanner temp = new Scanner(System.in);
            tab2[i] = temp.nextInt();
        }

        for (int i = 0; i < wielkosc; i++) {
            wynik += (tab1[i] * tab2[i]);
        }
        System.out.println(String.format("Iloczyn skalarny to: %s", wynik));
    }

    private static void zadanie6() {
        System.out.println("Podaj rozmiar tablic");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        Random random = new Random();
        int tab1[] = new int[size];
        int tab2[] = new int[size];

        if (size % 2 != 0) {
            System.err.println("Podano nieparzystą wartość");
            return;
        }

        for (int i = 0; i < size; i++) {
            tab1[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(tab1));

        for (int i = 0; i < size; i++) {
            tab2[i] = tab1[(size - 1) - i];
        }
        System.out.println(Arrays.toString(tab2));
    }

    private static void zadanie7() {
        System.out.println("Podaj rozmiar x");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println("Podaj rozmiar y");
        int y = in.nextInt();
        Random random = new Random();

        int tab[][] = new int[x][y];
        for (int xi = 0; xi < x; xi++) {
            for (int yi = 0; yi < y; yi++) {
                tab[xi][yi] = random.nextInt();
            }
        }
        int wynik = 0;
        for (int xi = 0; xi < x; xi++) {
            for (int yi = 0; yi < y; yi++) {
                wynik += tab[xi][yi];
            }
        }
        System.out.println(String.format("Suma to: %s", wynik));
    }

    public static int getNumberOfSeconds(int minutes) {
        if (minutes <= 0) {
            throw new IllegalArgumentException("Minutes < 0");
        }
        return minutes * 60;
    }

    private static void zadanie9() {
        Scanner scanner = new Scanner(System.in);
        try {
            getNumberOfSeconds(Integer.parseInt(scanner.next()));
        } catch (NumberFormatException e) {
            throw new InputMismatchException(e.getMessage());
        }
    }

    private static void zadanie10() {
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
            double v1 = 0.0;
            double v2 = 0.0;
            System.out.println("Podaj pierwszą liczbę");
            try {
                v1 = scanner.nextInt();
            }
            catch (InputMismatchException e){
                System.err.println("Wpisano liczbę inną niż całkowitą bądź tekst");
            }
            System.out.println("Podaj drugą liczbę");
            try {
                v2 = scanner.nextInt();
            }
            catch (InputMismatchException e){
                System.err.println("Wpisano liczbę inną niż całkowitą bądź tekst");
            }
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
                case "4": {
                    if(v2==0.0){
                        throw new IllegalArgumentException("Nie można dzielić przez zero");
                    }
                    System.out.println(String.format("Wynik dzielenia: %s", (v1 / v2)));
                    break;
                }
            }
        } else {
            System.out.println("Nieprawidłowy parametr");
        }
    }


}
