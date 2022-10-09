package whileLoops;
import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number;
		
		do {
			System.out.print("Please enter a negetive number : ");
			number = sc.nextInt();
		} while (number >= 0);
		
		System.out.println("End");
		
		sc.close();

	}

}
