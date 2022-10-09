package patterns;
import java.util.Scanner;

public class AdvancedPattern8 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the pattern : ");
		int n = sc.nextInt();
		
		
		for (int i = 1; i <= n; i++) {
			
			int number = 0;
			
			for (int j = 1; j <= n - i; j++) {
				System.out.print("   ");
			}
			
			for (int j = 1; j <= 2 * i - 1; j++) {
				number++;
				System.out.print(number + "  ");
			}
			System.out.println();
			
			
		}
		
		
		sc.close();
		
		

	}

}
