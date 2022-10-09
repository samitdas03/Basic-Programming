package oops.inheritence;

public class MainClass {

    public static void main(String[] args) {

        Teacher t1 = new Teacher();

        t1.name = "Mr. Harry";
        
        t1.eat();
        t1.teach();
        t1.walk();                                                  // method over-riding

        t1.eatSuper();

    }
    
}
