package patterns;
import java.util.Scanner;

public class AdvancedPattern11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the Pattern : ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print("  ");
			}	
				
			for (int k = 1; k <= i - 1; k++) {
				System.out.print("");
			}	
			
		}
		
		sc.close();

	}

}
