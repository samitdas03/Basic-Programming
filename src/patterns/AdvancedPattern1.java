package patterns;
import java.util.Scanner;


public class AdvancedPattern1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the pattern : ");
		int size = sc.nextInt();
		
		for (int i = 1; i <= size; i++) {
			
			for (int j = 1; j <= (size - i); j++) {
				System.out.print("  ");
			}
			
			for (int j = 1; j <= i; j++) {
				System.out.print("*   ");
			}
			
			System.out.println();
			
		}
		
		sc.close();
		
	}

}
