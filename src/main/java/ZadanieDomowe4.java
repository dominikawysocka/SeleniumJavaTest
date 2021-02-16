public class ZadanieDomowe4 {

    public static void main(String[] args) {

        Student studenciak1 = new Student();
        studenciak1.imie = "Jan";
        studenciak1.nazwisko = "Bombela";
        studenciak1.mail = "jabomb423@polsl.pl";
        studenciak1.numerIndeksu = 1;

        Student studenciak2 = new Student();
        studenciak2.imie = "Jano";
        studenciak2.nazwisko = "Bombelo";
        studenciak2.mail = "jabombolo423@polsl.pl";
        studenciak2.numerIndeksu = 2;

        Student studenciak3 = new Student();
        studenciak3.imie = "TrioJano";
        studenciak3.nazwisko = "TriBombelo";
        studenciak3.mail = "jabomb333@polsl.pl";
        studenciak3.numerIndeksu = 3;

        Student[] tablicaStudenciakow = new Student[]{studenciak1, studenciak2, studenciak3};

        for (final Student student : tablicaStudenciakow) {
            student.info();
        }
    }
}
