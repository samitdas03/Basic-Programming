package oops.inheritence;

public class Teacher extends Person {                                    // sub-class or children-class

    public void teach() {
        System.out.println(name + " is teaching");
    }

    public void walk() {
        System.out.println("teacher " + name + " is walking");
    }

    public void eatSuper() {
        super.eat();                                // super keyword is used by a sub-class whenever it needs to refer to it's immediate super-class

        System.out.println("this function is called through super keyword from parent class person");
    }
    
}
