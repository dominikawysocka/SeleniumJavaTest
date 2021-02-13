import java.util.Scanner;

public class ZadanieDomowe2 {

    public static void main(String[] args) {

        System.out.println("Dzień dobry, ile masz lat?");
        Scanner skaner = new Scanner(System.in);
        String wiek = skaner.nextLine();
        Double wiekInDouble = null;
        try {
            wiekInDouble = Double.parseDouble(wiek);

        } catch (NumberFormatException nfe) {
            System.out.println("Chyba podałeś niepoprawny wiek ");
        }

        if (wiekInDouble != null) {
            if (wiekInDouble > 18) {
                System.out.println("Ok, dziękuję za zakupy");
            } else {
                System.out.println("Niestety jesteś za młody");
            }
        }
    }

}
