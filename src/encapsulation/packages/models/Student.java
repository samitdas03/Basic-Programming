package encapsulation.packages.models;

public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
        System.out.println("new student object is created");
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {

    }
    
}
