package conditionalStatements; 
import java.util.Scanner;


public class SwitchCaseStatements2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your rating for uber experience : ");
		int rating = sc.nextInt();
		
		switch (rating) {
		
		case 1:
		case 2:
			System.out.println("Your experience is bad");
			System.out.println("We will try to improve our ride quality, Thank You");
			break;
		case 3:
			System.out.println("Your experience is average");
			break;
		case 4:
			System.out.println("Your experience is good");
			break;
		case 5:
			System.out.println("Your experience is very good");
			break;
			
		default:
			System.out.println("Enter a valid rating");
		
		
		}
		
		sc.close();

	}

}
