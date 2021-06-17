package java_start;

public class NthPowerM {
	
	//Finding the Nth power of M, where M is a number. this is done by Binary Search.
	//time complexity is O(n)* log(m*10).
	public static double multiplier(double num, double n) {
		double res = 1.0;
		
		for(int i=0;i<=n;i++) {
			res = res*num;
		}	
		return res;
	}
	
	public static double nthPowerMBinarySearch(double n, double m) {
		double low = 1;
		double high = m;
		double epsilon = 1e-9;
		
		while((high-low) > epsilon) {
			
			double mid = (low+high)/2.0;
			
			if(multiplier(mid, n) > m) {
				high = mid;
			
			}else {
				low = mid;
			}
		}
		
		//System.out.print(low+" "+high);
		
		return low;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double n = 3;
		double m = 27;
		
		double result = nthPowerMBinarySearch(3,27);
		
		System.out.print(n+" th power of "+m+" is-> "+ result);
	}

}
