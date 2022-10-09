package oops;

class Dog {
    int legs;
}

public class PassByValue2 {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.legs = 3;
        Dog dog2 = new Dog();
        dog2.legs = 4;

        dogSwap(dog1, dog2);

        System.out.println(dog1.legs + "\n" + dog2.legs);

        changeDogLegs(dog1);

        System.out.println(dog1.legs);



    }

    static void dogSwap(Dog a, Dog b) {
        Dog temp = a;
        a = b;
        b = temp;
    }

    static void changeDogLegs(Dog dog) {
        dog.legs = 10;
    }

    
    
}
