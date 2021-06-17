 package java_start;

public class GridUniquePath {
	public static int gridUniquePath(int n, int m, int[][]dp) {
		int i = 0,j = 0;
		
		if(i == n-1 || j == m-1) {
			return 1;
		}
		
		else if(dp[i][j] != -1) {
			return dp[i][j];
		}
		
		else if(i >= n || j >= m) {
			return 0;
		}
		
		return dp[i][j] = gridUniquePath(i+1, j,dp) + gridUniquePath(i, j+1,dp);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3, m = 3;
		int dp[][] = new int [n][m];
		
		//initialise with -1.
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[0].length;j++) {
				dp[i][j] = -1;
			}
		}
		
		int result = gridUniquePath(n, m, dp);
		
		System.out.println("result--> "+result);
	}

}
