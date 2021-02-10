public interface Figura {
    double obwod();
    double pole();

    default void display() {
        System.out.println("Obwód: " + obwod() + ", Pole: " + pole());
    }
}
