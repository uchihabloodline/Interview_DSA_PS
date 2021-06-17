package java_start;
import java.lang.*;

public class MaxSumSubarray {
	
	public static int maxSumSubArrayLength(int arr[], int n, int targetVal) {
		// eg = {5,6,-5,5,3,5,3,-2,0}
		
		int maxCount = 0;
		
		// int maxSum = 0;
		int count = 0;
		int sum = 0;
		for(int i=0; i<n; i++) {
			if(sum+arr[i] <= targetVal) {
				sum += arr[i];
				count+=1;
			}
			
			else if(sum != 0) {
				sum = sum - arr[i-count] + arr[i];  //take on to next value and ignore the previously computed one
			}
			
			maxCount = Math.max(count, maxCount);
			
		}
		return maxCount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// eg = {5,6,-5,5,3,5,3,-2,0}
		
		int arr[] = {5,6,-5,5,3,5,3,-2,0};
		int target = 8;
		int length = arr.length;
		
		int result = maxSumSubArrayLength(arr,length, target);
		
		System.out.print("answer-->"+result);
	}

}
