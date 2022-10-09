package oops;

class Vehicle {
    int wheels;
    int headLights;
    String company, colour;

    Vehicle(int noOfWheels, String company) {
        wheels = noOfWheels;
        headLights = 2;
        this.company = company;
    }

    Vehicle(int wheels, String company, String colour) {                            // constructor overloading (parameter signature or data type shoud be different)
        this.wheels = wheels;
        this.company = company;
        this.colour = colour;
        headLights = 2;  
    }

    Vehicle() {                                                                     // constructor overloading
        
    }
}

public class MyConstructor {

    MyConstructor() {
        System.out.println("object is now created");
    }

    public static void main(String[] args) {

        // MyConstructor obj = new MyConstructor();

        Vehicle car = new Vehicle(4, "Audi");
        Vehicle scooty = new Vehicle(2, "TVS");

        System.out.println(car.wheels);
        System.out.println(scooty.wheels); 
        System.out.println(car.headLights);
        System.out.println(car.company);

        Vehicle truck = new Vehicle(8, "TATA", "Orange");

        System.out.println(truck.colour);
        System.out.println(truck.company);

    }
    
}
