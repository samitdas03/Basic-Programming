package forLoops;
import java.util.Scanner;


public class Break {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for (;;) {
			System.out.print("Enter a negetive number : ");
			float number = sc.nextInt();
			
			if (number < 0) {
				sc.close();
				break;
			}
		}
		
		
		for (int i = 1; i < 10; i++) {
			
			if (i == 5) 
				break;
			
			System.out.println(i);
			System.out.println("Hello World " + i);
		}
		
		

	}

}
