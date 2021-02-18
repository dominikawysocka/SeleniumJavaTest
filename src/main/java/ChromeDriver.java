public class ChromeDriver implements WebDriver {


    @Override
    public void get() {
        System.out.println("Otwieram przeglądatkę Google Chrome");
    }

    @Override
    public void findElementBy() {
        System.out.println("Szukam elementu na Chromie");
    }
}
