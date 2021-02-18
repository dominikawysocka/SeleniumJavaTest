public class App {

    public String name;

    public App(final String name) {
        this.name = name;
        System.out.println("jestem w konstruktorze app");
    }

    public void appInfo() {
        System.out.println("Nazwa aplikacji" + name);
    }


}
