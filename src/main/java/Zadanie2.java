import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zadanie2 {

    public static void main(String[] args) {

        String palindrom = "kamilslimak";
        if (czyPalindrom(palindrom)){
            System.out.println("Tak, " + palindrom + " jest palindromem!");
        }
        else {
            System.out.println("Nie , " + palindrom + " nie jest palindromem!");
        }

    }

    private static boolean czyPalindrom(String wyraz) {

        List<Character> tablica = new ArrayList<>();

        for (int i = 0; i < wyraz.length(); i++) {
            tablica.add(i,wyraz.charAt(i));
        }

        List<Character> tablicaTemp = new ArrayList<>();
        tablicaTemp.addAll(tablica);
        Collections.reverse(tablicaTemp);

        return tablica.equals(tablicaTemp);
    }
}
