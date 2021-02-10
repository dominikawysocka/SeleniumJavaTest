import java.util.Objects;

public class Dupa implements Test {
    public static final String DUPA = "dupa";
    private String dupa;
    private String dupa2;
    private int b;
    public static final int A = 1;

    public Dupa(final String dupa, final String dupa2) {
        this.dupa = dupa;
        this.dupa2 = dupa2;
    }

    public Dupa(final String dupa) {
        this.dupa = dupa;
    }

    public void test() {
        b = 2;
        final int c = getAdd(A, b);
    }

    private int getAdd(final int a, final int b) {
        return a + b;
    }

    public String getDupa() {
        return dupa;
    }

    public void setDupa(final String dupa) {
        this.dupa = dupa;
    }

    public String getDupa2() {
        return dupa2;
    }

    public void setDupa2(final String dupa2) {
        this.dupa2 = dupa2;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Dupa dupa1 = (Dupa) o;
        return b == dupa1.b &&
                Objects.equals(dupa, dupa1.dupa) &&
                Objects.equals(dupa2, dupa1.dupa2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dupa, dupa2, b);
    }

    @Override
    public String toString() {
        return "Dupa{" +
                "dupa='" + dupa + '\'' +
                ", dupa2='" + dupa2 + '\'' +
                ", b=" + b +
                '}';
    }

    @Override
    public int calcArea() {
        return 0;
    }
}
