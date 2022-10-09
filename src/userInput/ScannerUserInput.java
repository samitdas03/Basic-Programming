package userInput;
import java.util.Scanner;


public class ScannerUserInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your Principal : ");
		double principal = sc.nextDouble();
		
		System.out.print("Enter Rate : ");
		double rate = sc.nextDouble();
		 
		System.out.print("Enter Time : ");
		double time = sc.nextDouble();
		
		double simpleInterest = principal * rate * time / 100;
		
		System.out.println("Your final Simple Interest is : " + simpleInterest);
		sc.nextLong();
		
		sc.close();
		
	}

}
