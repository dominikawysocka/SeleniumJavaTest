public class Kalkulator {

    public double dodawanie(double x, double y) {
        return x + y;
    }

    public double odejmowanie(double x, double y) {
        return x - y;
    }

    public double mnożenie(double x, double y) {
        return x * y;
    }

    public double modulo(double x, double y) {
        return x % y;
    }

    public double dzielenie(double x, double y) {
        if (y != 0) {
            return x / y;
        } else {
            System.out.println("Nie dziel cholero przez zero!");
            return 0;
        }
    }

}
