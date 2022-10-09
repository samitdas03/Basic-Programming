package forLoops;

public class Continue {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
			
			if (i == 45)
				System.out.println();
				
			if (i > 40 && i < 50) {
				continue;
			}
			
			System.out.println(i);
			
		}

	}

}
