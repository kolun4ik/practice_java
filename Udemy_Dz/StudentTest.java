class Student {
    int id_stud;
    String name;
    String surname;
    int course;
    double amount_math;
    double amount_econ;
    double amount_lang;

    double amounts(double a, double b, double c) {
        double result = (a + b + c) / 3;
        return result;
    }
}

public class StudentTest {

    double sredArifmOtsenka(Student st) {
        double sredOtsenka = (st.amount_math + st.amount_econ + st.amount_lang)/3;
        System.out.println(
                "Srednyaya arifmeticheskaya otsenka studenta " + st.name + " " + st.surname + " :" + sredOtsenka
        );
        return sredOtsenka;
    }

    public static void main(String[] args) {
        System.out.println("Test students class!");

        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();

        st1.id_stud = 1;
        st1.name = "Pasha";
        st1.surname = "Koen";
        st1.course = 4;
        st1.amount_math = 3;
        st1.amount_econ = 4;
        st1.amount_lang = 5;

        st2.id_stud = 2;
        st2.name = "Ella";
        st2.surname = "Trics";
        st2.course = 4;
        st2.amount_math = 5;
        st2.amount_econ = 4;
        st2.amount_lang = 4;

        st3.id_stud = 3;
        st3.name = "Ivan";
        st3.surname = "Draga";
        st3.course = 2;
        st3.amount_math = 3;
        st3.amount_econ = 3;
        st3.amount_lang = 3;

        StudentTest sTest = new StudentTest();
        sTest.sredArifmOtsenka(st1);
        sTest.sredArifmOtsenka(st2);
        sTest.sredArifmOtsenka(st3);

    }
}