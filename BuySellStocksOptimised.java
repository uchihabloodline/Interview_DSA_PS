package java_start;

import java.lang.*;


public class BuySellStocksOptimised {
	
	/* This problem can be solved with the bruteforce approach using
	 * two loops, one for iterating all elements at one by one and other jth loop
	 * for iterating over all the elements in the right half of array 
	 * and at every step we will compute the maxProfit value return the 
	 * maximum profit at the end of loop.
	 */
	static int maxProfit(int [] arr) {
		int maxProfit = Integer.MIN_VALUE;
		int minPrice = Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			minPrice = Math.min(minPrice, arr[i]);
			maxProfit = Math.max(maxProfit, (arr[i]-minPrice));
		}
		return maxProfit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// {7,1,5,3,6,4}
		// output => 6-1 = 5
		int arr[] = {7,1,5,3,10,4};
		System.out.println("maxProfit--> "+ maxProfit(arr));

	}

}
