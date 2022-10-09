package oops;

class Cat {                                                    // creating Cat class
    boolean hasFur;                                            // state of Cat class
    String colour, breed;
    int age;

    public void walk() {                                       // methods of Cat class
        System.out.println("The cat is walking");
    }

    public void eat() {
        System.out.println("The cat is eating");
    }

    public void description() {
        System.out.println("The colour of the cat is " + colour);
        System.out.println("The breed of the cat is " + breed);
        System.out.println("The age of the cat is " + age);
    }
}




public class MainClass {                                        /* every .java file should have only one main class
                                                                    name of .java file = name of public class */
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        cat1.hasFur = true;
        cat1.colour = "Milk White";
        cat1.breed = "xyz";
        cat1.age = 3;

        cat1.walk();
        cat1.eat();

        System.out.println(cat1.colour);
        cat1.description();
        cat2.description(); 



    }
    
}
