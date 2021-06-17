package java_start;

public class PascalsTriangleNthValue {
	
	public static int nthPascalValue(int n, int k) {
		//Formula to calculate nth value from pascal triangle. :- n-1Cr-1.
		int result = 0;
		for(int i=k;i>0;i--) {
			result = n*(n-1)/k;
			n = n-1;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = nthPascalValue(5, 2);
		System.out.print(result);
	}

}
