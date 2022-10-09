package encapsulation.packages.models;

public class Teacher {
    public String name;
    public int age;
    private int salary;

    public Teacher(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        System.out.println("new teacher object is created");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int salarySecond() {
        int a = getSalary();
        return a;
    }

    private int getSalary() {
        return salary;
    }

    public void salaryThird() {
        System.out.println(getSalary());
    }



    public static void main(String[] args) {

    }

    

}
