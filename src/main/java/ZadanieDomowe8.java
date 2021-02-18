import java.util.Scanner;

public class ZadanieDomowe8 {

    public static void main(String[] args) throws InvalidAgeException {

        System.out.println("Cześć, ile masz lat?");
        Scanner scaner = new Scanner(System.in);
        int age = scaner.nextInt();

        if (age < 0){
            throw  new InvalidAgeException("Age is not valid");
        }
        else if ( age >= 18){
            System.out.println("Jesteś pełnoletni");
        }

    }

}
