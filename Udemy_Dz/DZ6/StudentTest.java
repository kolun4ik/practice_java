class Student {
    int id_stud;
    String name;
    String surname;
    int course;
    double amount_math;
    double amount_econ;
    double amount_lang;

    Student(int id1, String name1, String surname1, int course1, double math1, double econ1, double lang1) {
        id_stud = id1;
        name = name1;
        surname = surname1;
        course = course1;
        amount_math = math1;
        amount_econ = econ1;
        amount_lang = lang1;
    }

    Student(int id2, String name2, String surname2, int course3){
        this(id2, name2, surname2, course3, 0,0,0);
    }

    Student() {
        this(0, null, null, 0, 0, 0,0);
    }
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
        Student st1 = new Student(1, "Pasha", "Koen", 4, 3,4,5);
        Student st2 = new Student(2, "Ella", "Trics", 4);
        Student st3 = new Student();

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