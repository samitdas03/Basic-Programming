package operators;

public class AssignmentOperator {

	public static void main(String[] args) {
		
		int a = 4;
		 
		a += 2;                     // a = a + 2 = 6
		a -= 2;                     // a = a - 2 = 4
		a *= 2;                     // a = a * 2 = 8
		a /= 2;                     // a = a / 2 = 4
		a %= 2;                     // a = a % 2 = 0
		a <<= 3;                    // a = a * 8 = 0 
		a &= 5;                     // a = a & 5 = 000 & 101 = 0
		a |= 5;                     // a = a | 5 = 000 & 101 = 5
		
		System.out.println(a);
		
	}

}
