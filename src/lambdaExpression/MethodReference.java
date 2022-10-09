package lambdaExpression;

@FunctionalInterface
interface Calculator {
    void add(int num1, int num2);
}

class Calc {
    public static void addSomething(int num1, int num2) {
        System.out.println(num1 + " and " + num2 + " adds to: " + (num1 + num2));
    }

    void letsAdd(int num1, int num2) {
        System.out.println(num1 + " and " + num2 + " adds to: " + (num1 + num2));
    }

}

public class MethodReference {

    public static void main(String[] args) {

        //1. Reference to a static method
        Calculator cRef1 = Calc :: addSomething;
        cRef1.add(12, 15);

        //2. Reference to a instance method
        Calc calc = new Calc();

        Calculator cRef2 = calc :: letsAdd;
        cRef2.add(17, 22);
        
    }
    
}
