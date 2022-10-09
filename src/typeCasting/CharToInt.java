package typeCasting;

public class CharToInt {

	public static void main(String[] args) {
		int x = 3 + 'd';
		int y = '%';                               // Corresponding ASCII value
		
		char z = (char)x;
		
		System.out.println(x + "\n" + y + "\n" + z);

	}

}
