package operators;
import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {

		/* 
		   Logical operators are 'and' -> &&
		                         'or'  -> ||
		                         'not' -> !
		 */
		
		
		// Bitwise operators check both conditions
		// Logical operators do not check both conditions when not required
		
		/*
		   And
		   
		   1 1    1
		   1 0    0
		   0 1    0     logical 'and' operator will not check the 1 in this case BUT the bitwise 'and' will
		 */
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your grade?");
		System.out.print("Ans : ");
		
		int grade = sc.nextInt();
		
		if (grade == 10 || grade == 12) {
			
			System.out.println("You can give board exams now");
			
		} else if (grade > 12 || grade < 1) { 
			
			System.out.println("Invalid");
			
		} else {
			
			System.out.println("You can not give the board exam now");
			
		}
		
		sc.close();
		
	}

}
