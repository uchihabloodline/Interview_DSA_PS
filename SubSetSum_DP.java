package java_start;

public class SubSetSum_DP {
	
	public static boolean subsetSum_DP(int arr[], int sum, int n) {
		
		//initialise dp array.
		boolean dp[][] = new boolean[n+1][sum+1];
		
		for(int i=0; i<=n; i++) {
			for(int j=0;j<=sum;j++) {
				
				if(i == 0 && j == 0) {
					dp[i][j] = true;
				}
				
				if(i != 0 && j == 0) {
					dp[i][j] = true;
				}
				
				if(i == 0 && j != 0) {
					dp[i][j] = false;
				}
				
			}
		}
		
//		for (int i = 0; i <= n; i++)
//        {
//	        for (int j = 0; j <= sum; j++)
//	            System.out.println (dp[i][j]);
//	        }
		
			// i -- n			// j -- sum vals
		//{3, 4, 5, 2}
		// sum = 44
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=sum; j++) {
				
				if(arr[i-1] <= j) {
					dp[i][j] = (dp[i-1][j-arr[i-1]]) || (dp[i][j]);
				}
				
				else {
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		
		return dp[n][sum];
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//True, subset is {4,5}.
		
		int arr[] = {3, 34, 4, 12, 5, 2};
		int n = arr.length;
		int sum = 9;
		
		boolean result = subsetSum_DP(arr, sum, n);
		
		System.out.println(result);
	}

}
