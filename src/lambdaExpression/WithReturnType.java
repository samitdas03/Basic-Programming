package lambdaExpression;

@FunctionalInterface
interface Ola {
    double bookOla(double distance);
}

public class WithReturnType {

    public static void main(String[] args) {
        
        Ola ola = (distance) -> {
            double fee = distance * 7;
            System.out.print("Your ola booked, the price is ");
            return fee;
        };

        System.out.println(ola.bookOla(13));

    }
}
