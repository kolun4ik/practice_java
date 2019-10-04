class Employee {
    int id;
    String name;
    String surname;
    int age;
    double salary;
    String departmant;

    Employee(int number, String n, String s, int vozrats, double zp, String dep) {
        id = number;
        name = n;
        surname = s;
        age = vozrats;
        salary = zp;
        departmant = dep;
    }
    double salary_x2(double m){
        double sal_x2 = m * 2;
        return sal_x2;
    }
}


class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Sara", "Konor", 35, 350, "Terminator destroy");
        Employee emp2 = new Employee(2, "Brain", "Stark", 11, 500, "Tree eye raven");
        System.out.println("Up 2X salary for " + emp1.name + " Now his salary is  " + emp1.salary_x2(emp1.salary));
        System.out.println("Up 2X salary for " + emp2.name + " Now his salary is  " + emp2.salary_x2(emp2.salary));

    }
}