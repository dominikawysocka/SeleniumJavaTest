import java.util.Scanner;

public class ZadanieDomowe5 {


    public static void main(String[] args) {

        System.out.println("Podejże liczbe");
        Scanner scanner = new Scanner(System.in);
        double pierwszaLiczba = scanner.nextDouble();
        System.out.println("Podejże drugo liczbe");
        double drugaLiczba = scanner.nextDouble();

        Kalkulator kalk = new Kalkulator();

        System.out.println("Dodawanie: " + kalk.dodawanie(pierwszaLiczba, drugaLiczba));
        System.out.println("Odejmowanie: " + kalk.odejmowanie(pierwszaLiczba, drugaLiczba));
        System.out.println("Mnozenie: " + kalk.mnożenie(pierwszaLiczba, drugaLiczba));
        System.out.println("Dzielenie: " + kalk.dzielenie(pierwszaLiczba, drugaLiczba));
        System.out.println("Modulo: " + kalk.modulo(pierwszaLiczba, drugaLiczba));

    }

}
