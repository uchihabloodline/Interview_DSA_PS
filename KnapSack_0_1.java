package java_start;

public class KnapSack_0_1 {
	
	public static int maxCapacityRecursion(int val[], int weights[], int W, int n) {
		
		//Will store values which are computed already.
		int dp[][] = new int[n+2][W+2];
		
		// initialise with -1
		for(int i=0; i<dp.length; i++) {
			for(int j=0;j<dp[0].length; j++) {
				dp[i][j] = -1;
			}
		}
		
		//base condition
		if(n == 0 || W == 0) {
			return dp[n][W] = 0;
		}
		
		//If Dp matrix has the solution already.
		if(dp[n][W] != -1) {
			System.out.print("===Ran");
			return dp[n][W];
		}
		
		//item is heavier then the capacity of the KnapSack.
		if(weights[n-1] > W) {
			System.out.print("===Ran1");
			dp[n][W] = maxCapacityRecursion(val, weights, W, n-1);
		}
		else {
			
		//When item can be added into the KnapSack.
			System.out.println("===Ran2 ");
			return dp[n][W] = Math.max(val[n-1] + maxCapacityRecursion(val, weights, W-weights[n-1], n-1),
									maxCapacityRecursion(val, weights, W, n-1));
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int values[] = {60, 100, 120};
		int weights[] = {10, 20, 30};
		int n = weights.length;
		int W = 50;
		
		int maxCapacity = maxCapacityRecursion(values, weights, W, n);
		
		System.out.println("0-1 knapcack[RECURSIVE METHOD] maxCapacity--> "+maxCapacity);
		
	}

}
