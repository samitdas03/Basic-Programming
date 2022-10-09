package conditionalStatements;
import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers");
		
		System.out.print("First number is : ");
		int a = sc.nextInt();
		
		System.out.print("Second number is : ");
		int b = sc.nextInt();
		
		System.out.print("Third number is : ");
		int c = sc.nextInt();
		
		int maxOfthreeNumbers;
		
		if (a > b) {
			
			if (a > c) {
				maxOfthreeNumbers = a;
			} else {
				maxOfthreeNumbers = c;
			}
			
		} else { 
			
		    if (b > c) {
				maxOfthreeNumbers = b;
		    } else {
				maxOfthreeNumbers = c;
			}
		
		}


		System.out.println("Max of three numbers is : " + maxOfthreeNumbers);
		
		sc.close();

	}

}
