class Student {
    int id_stud;
    String name;
    String surname;
    int course;
    double amount_math;
    double amount_econ;
    double amount_lang;
}

public class StudentTest {
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
        System.out.println("Uspevaemost student " + st1.name + " " + st1.surname + " = " +
                (st1.amount_math+st1.amount_econ+st1.amount_lang)/3);

        st2.id_stud = 2;
        st2.name = "Ella";
        st2.surname = "Trics";
        st2.course = 4;
        st2.amount_math = 5;
        st2.amount_econ = 4;
        st2.amount_lang = 4;
        System.out.println(
                "Uspevaemost student " + st2.name + " " + st2.surname + " = " +
                        (st2.amount_math + st2.amount_econ + st2.amount_lang) / 3);

        st3.id_stud = 3;
        st3.name = "Ivan";
        st3.surname = "Draga";
        st3.course = 2;
        st3.amount_math = 3;
        st3.amount_econ = 3;
        st3.amount_lang = 3;
        System.out.println(
                "Uspevaemost student " + st3.name + " " + st3.surname + " = " +
                        (st3.amount_math + st3.amount_econ + st3.amount_lang) / 3
        );
    }
}