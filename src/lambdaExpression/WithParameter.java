package lambdaExpression;

@FunctionalInterface
interface Bus {
    void bookBus(String source, String destination);
}

public class WithParameter {

    public static void main(String[] args) {

        Bus bus = (source, destination) -> {
            System.out.println("Bus booked from " + source + " to " + destination + ", arriving soon!!");
        };

        bus.bookBus("Contai", "Calcutta");
        
    }
    
}
