public class Student {
    String imie;
    String nazwisko;
    int numerIndeksu;
    String mail;

    public Student(final String imie, final String nazwisko, final int numerIndeksu, final String mail) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerIndeksu = numerIndeksu;
        this.mail = mail;
    }


    public  void info (){
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Mail: " + mail);
        System.out.println("Indeks: " + numerIndeksu);
    }
}
