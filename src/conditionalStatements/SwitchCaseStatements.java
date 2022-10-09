package conditionalStatements;
import java.util.Scanner;

public class SwitchCaseStatements {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type two numbers");
		sc.nextLine();
		
		System.out.print("First number : ");
		double firstNumber = sc.nextDouble();
		
		System.out.print("Second number : ");
		double secondNumber = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.print("Operator : ");
		char operator = sc.nextLine().charAt(0);
		
		double result = 0;
		
		switch (operator) {
				
		case '-':
			result = firstNumber - secondNumber;
			break;
		case '+':
			result = firstNumber + secondNumber;
			break;
		case '*':
			result = firstNumber * secondNumber;
			break;
		case '/':
			result = firstNumber / secondNumber;  
			break;
			
		default:
			System.out.println("Enter a valid operator");
			
		}
		
		
		System.out.println("The result is : " + result);
	
		sc.close();

	}

}
