package conditionalStatements;

public class TernaryOperator {

	public static void main(String[] args) {

		// variable = (condition) ? expressionTrue : expressionFalse ;
		
		int a = 15;
		int b = 8;
		 
		int maxOfBothNumbers;
		
		maxOfBothNumbers = (a > b) ? a : b ;
		
		System.out.println("Max of both numbers is " + maxOfBothNumbers);
		
		
		
		
		int c = 12;
		int d = 180;
		int e = 100;
		
		int maxOfThreeNumbers;
		
		maxOfThreeNumbers = (c > d) ? (c > e) ? c : e : (d > e) ? d : e;
		
		System.out.println("Max of three numbers is " + maxOfThreeNumbers); 
		
		
		
	}

}
