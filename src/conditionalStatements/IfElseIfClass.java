package conditionalStatements;
import java.util.Scanner;


public class IfElseIfClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Run scored by Batsman : ");
		
		int run = sc.nextInt();
		
		if (run < 0) {
			
			System.out.println("Please enter a valid run");
			
		} else if (run == 0) {
			
			System.out.println("Batsman got out at duck or He did not got a chance to bat");
			
		} else if (run > 0 && run < 50) {
			
			System.out.println("Well played");
			
		} else if (run >= 50 && run < 100) {
			
			System.out.println("It's a half century");
			
		} else if (run >= 100 && run <200) {
			
			System.out.println("It's a century");
			
		} else if (run >= 200 && run < 300) {
			
			System.out.println("It's a double century");
			
		} else {
			
			System.out.println("He is a GOD");
			
		}

		sc.close();
		
	}

}
