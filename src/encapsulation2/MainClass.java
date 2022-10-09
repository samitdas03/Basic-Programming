package encapsulation2;

public class MainClass {

    public static void main(String[] args) {

        Student obj = new Student();

        obj.setName("Samit");
        obj.setAge(-12);

        System.out.println(obj.getName());
        System.out.println(obj.getAge());

    }

    
}
