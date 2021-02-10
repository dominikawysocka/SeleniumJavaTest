import java.util.Scanner;

public class ZadanieDomowe1 {

    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);
        System.out.println("Cześć, podaj pierwczą liczbę");
        double pierwszaLiczba = skaner.nextDouble();
        System.out.println("Podaj drugą liczbę");
        double drugaLiczba = skaner.nextDouble();

        System.out.println("Dodawanie:" + (pierwszaLiczba + drugaLiczba));
        System.out.println("Odejmowanie:" + (pierwszaLiczba - drugaLiczba));
        System.out.println("Mnożenie:" + (pierwszaLiczba * drugaLiczba));
        System.out.println("Dzielenie:" + (pierwszaLiczba / drugaLiczba));
        System.out.println("Modulo:" + (pierwszaLiczba % drugaLiczba));

    }
}

