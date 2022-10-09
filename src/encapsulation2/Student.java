package encapsulation2;

public class Student {

    private String name;
    private int age;


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {

        if (age <= 0) {
            System.out.println("Enter a valid age");
        } else if (age >= 20) {
            System.out.println("Student is too old to be a student");
        } else {
            this.age = age;
        }

    }
    public int getAge() {
        return age;
    }


}
