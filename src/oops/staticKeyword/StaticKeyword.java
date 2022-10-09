package oops.staticKeyword;

import oops.staticKeyword.A.B;
import oops.staticKeyword.A.C;

public class StaticKeyword {                   // it is used for memory-management

    static {
        System.out.println("in block 1");
    }
    static {
        System.out.println("in block 2");
    }

    public static void main(String[] args) {

        System.out.println(Person.breed);

        A objA = new A();
        B objB = objA.new B();

        C objC = new C();

    }

    static {
        System.out.println("in block 3");
    }
    
}




/**
 * The keyword static indicates that the particular member belongs to a type itself, rather than to an instance of that
 * of that type.
 * The keyword can be applied to variables, methods, blocks and nested class.
 * 
 * A field can not be declared static in a non-static inner type, unless initialized with a constant expression
 * A field can be declared static in main class.
 * 
 * A field can not be declared static in a method.
 * 
 * We can not declare a top-level class with static modifier, but we can declare a nested class as static.
 * nested class are of two type: static and non-static.
 * 
 * static blocks runs befor main method in order. 
 * 
 */
