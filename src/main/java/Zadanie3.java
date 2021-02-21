import java.util.ArrayList;
import java.util.List;

public class Zadanie3 {

    public static void main(String[] args) {

        int liczba = 10;
        fibbonaci(liczba);

    }

    private static void fibbonaci(int liczba) {

        List<Integer> tablica = new ArrayList<>();
        if (liczba > 0) {
            tablica.add(0, 1);
            System.out.println("1. Wartosc: 1");
        }
        if (liczba > 1) {
            tablica.add(1, 1);
            System.out.println("2. Wartosc: 1");
        }
        if (liczba > 2) {

            for (int i = 2; i <= liczba; i++) {

                int value = tablica.get(i - 2) + tablica.get(i - 1);
                tablica.add(i, value);
                System.out.println(i + ". Wartosc:" + tablica.get(i));
            }
        }
    }
}
