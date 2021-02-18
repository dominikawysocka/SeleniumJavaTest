public class InvalidAgeException extends Exception {

    public InvalidAgeException(final String message) {
        super(message);
    }

    public InvalidAgeException() {
    }

    public static void main(String[] args) {
        System.out.println("Uwaga wyjątek!");
    }
}
