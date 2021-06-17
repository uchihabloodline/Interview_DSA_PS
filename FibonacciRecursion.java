package java_start;

public class FibonacciRecursion {

	static int fibo(int n) { 
		
		// 0, 1, 1, 2, 3 ,5... 
		if(n <= 1) { //cause it starts from 0 and 1 is the next number
			return n;
		}
		
		return fibo(n-1) + fibo(n-2);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int input = 10;
		
		for(int i=0;i< input; i++) {
			System.out.print(fibo(i)+" ");
		}

	}

}
