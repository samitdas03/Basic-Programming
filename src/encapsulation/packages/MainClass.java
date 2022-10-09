package encapsulation.packages;

import encapsulation.packages.models.*;

public class MainClass {

    public static void main(String[] args) {
        Student s1 = new Student("Samit");
        Teacher t1 = new Teacher("Salil Bhoumuk", 49, 65000);

        String xyz = s1.getName();
        System.out.println(xyz);

        System.out.printf("Name : %s%nAge : %d%n", t1.getName(), t1.getAge()) ;
        System.out.println(t1.age);

        System.out.println(t1.salarySecond());
        t1.salaryThird();


        // t1.salary = 70000;

        // System.out.println(t1.getSalary());
        
    }
    
}
