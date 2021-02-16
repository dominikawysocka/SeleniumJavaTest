public class ZadanieDomowe4 {

    public static void main(String[] args) {

        Student studenciak1 = new Student("Jan","Bombela",1,"jabomb423@polsl.pl");

        Student studenciak2 = new Student("Jano","Bombelo",2,"jabomblo423@polsl.pl");

        Student studenciak3 = new Student("TrioJano","TriBombelo",3,"jabomb333@polsl.pl");

        Student[] tablicaStudenciakow = new Student[]{studenciak1, studenciak2, studenciak3};

        for (final Student student : tablicaStudenciakow) {
            student.info();
        }
    }
}
