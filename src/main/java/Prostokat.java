public class Prostokat implements Figura {
    protected double a;
    protected double b;

    public Prostokat(final double a, final double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double obwod() {
        return (2 * a) + (2 * b);
    }

    @Override
    public double pole() {
        return a * b;
    }

    public double getA() {
        return a;
    }

    public void setA(final double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(final double b) {
        this.b = b;
    }
}
