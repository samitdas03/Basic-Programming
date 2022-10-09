package oops.abstraction;

public class RepairShop {

    public static void repairCar(Car car) {
        System.out.println("car is repaired");
    }

    public static void main(String[] args) {

        WagonR wagonR = new WagonR();
        Audi audi = new Audi();

        repairCar(wagonR);
        repairCar(audi);

    }
    
}

/**
 * A class which is declared using "abstract" keyword is known as abstract-class.
 * 
 * It can have abstract methods (methods without body) as well as concrete methods (regular methods with body).
 * 
 * A normal class (non-abstract) cannot have abstract methods.
 * 
 * An abstract class cannot be instantiated, which mean you are not allowed to creat an object of it.
 * 
 * An abstract class must be extended and the same way abstract methods must be overriden.
 */
