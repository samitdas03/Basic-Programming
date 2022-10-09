package conditionalStatements;
import java.util.Scanner;

public class IfElseClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the number of petals?");
		System.out.print("Ans : ");
		
		int noOfPetals = sc.nextInt();
		
		if (noOfPetals % 2 == 0) {
			System.out.println("She loves me not");
		} else {
			System.out.println("She loves me");
		} 
		
		
		sc.close();

		
		
	}

}
