package oops.interfaces;

public class Person implements Student, YouTuber {

    public static void main(String[] args) {

        Person obj = new Person();

        obj.study();
        obj.makeVideo();
        
    }

    @Override
    public void makeVideo() {
        System.out.println("Person is making youtube video");
    }

    @Override
    public void study() {
        System.out.println("Person is studying");
    }
    
}




/**
 * We can not instantiate an interface in java as they can not have constructors.
 * 
 * Interfaces can not have a method with body.
 * 
 * By default any attribute of interface is public, static and final, so we don't need to provide access modifires
 * to the attributes but if we do, compiler doesn't complain about it either.
 * 
 * By default interface methods are implicitly abstract and public, it makes total sense because the method don't have
 * body so that the subclasses can provide the method implementation.
 * 
 * An interface can't extend any class but it can extend another interface.
 * 
 * A class implementing an interface must provide implementation for all of it's method unless it's an abstract class.
 */
