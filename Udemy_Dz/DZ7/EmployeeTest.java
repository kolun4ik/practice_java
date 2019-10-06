class Employee {
    int id;
    String name;
    String surname;
    int age;
    double salary;
    String departmant;

    Employee(int number, String name, String s, int vozrat, double zp, String dep) {
        protected id = number;
        name = name;
        public surname = s;
        age = vozrat;
        private salary = zp;
        departmant = dep;
    }
    Employee(int number1, String name1, String s1, int vozrast1) {
        this(number, name1, s1, vosrast1, 0,null);
    }
    Employee(){
        this(0, null, null, 0, 0, null);
    }
    double salary_x2(double m){
        salary *=  2;
        return salary;
    }
    public show_id(){
        System.out.println("Show id: " + id);
    }
    public show_surname(){
        System.out.println("Show surname: " + surname);
    }
    public show_salary(){
        System.out.println("Show salary: " + salary);
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