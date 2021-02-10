public class Trojkat implements Figura {
    private double a;
    private double b;
    private double c;

    public Trojkat(final double a, final double b, final double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    public double obwod() {
        return a + b + c;
    }

    @Override
    public double pole() {
        return (a * b) / 2;
    }
}
