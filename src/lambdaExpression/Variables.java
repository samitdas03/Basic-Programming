package lambdaExpression;

@FunctionalInterface
interface Unknown {
    void function();
}

public class Variables {

    int instanceVar = 10;
    static int staticVar = 100;
    
    public static void main(String[] args) {
        
        Variables var = new Variables();
        var.un.function();

        Unknown un2 = () -> {
            int localVar = 1000;

            System.out.println("Static variable is: " + staticVar);
            System.out.println("Instance variable is: " + var.instanceVar);
            System.out.println("Locak variable is:" + localVar);
        };

        un2.function();

        Unknown un3 = () -> {
            System.out.println("Static variable is: " + staticVar);
            System.out.println("Instance variable is: " + var.instanceVar);
        };

        un3.function();


    }

    Unknown un = () -> {
        int localVar = 1000;

        System.out.println("Static variable is: " + staticVar);
        System.out.println("Instance variable is: " + instanceVar);
        System.out.println("Locak variable is:" + localVar);
    };
    

}
