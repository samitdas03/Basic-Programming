package lambdaExpression;

@FunctionalInterface
interface Cab {       // -> when an interface will have exactly 1 abstract method we can say it as Functional Interface
    void bookCab();   // -> by default public abstract void bookCab()
}

class UberX implements Cab {
    public void bookCab() {
        System.out.println("UberX booked, arrving soon!!");
    }
}

public class LambdaApp {
    
    public static void main(String[] args) {

        // 1. Implementing the Cab interface on UberX class
        UberX ub = new UberX();
        ub.bookCab();

        // 2. Cab Anaonymous Class Implementation
        Cab cab = new Cab() {
            
            public void bookCab() {
                System.out.println("Cab booked, arriving soon!!");
            }
        };

        cab.bookCab();

        // 3. Lambda Expression
        Cab cab2 = ()->{
            System.out.println("Your cab booked, arriving soon!!");
        };

        cab2.bookCab();
        
    }

}
