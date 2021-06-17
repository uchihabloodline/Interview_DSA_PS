package java_start;

public class MaxSumSubarrayKSize {
	
	public static int kSizeSubarraySum(int [] arr, int k) {
		
		int maxSum = 0;
		int sum = 0;
		
		int start = 0;
		int end = 0;
		
		System.out.println("====1");
		
		if(k > arr.length) {
			return -1;
		}
		
		System.out.println("====2");
		
		//arr = [1,2,3,4,5,6];
		
		while(end != arr.length) {
			
			System.out.println("start== "+start);
			System.out.println("end== "+end);
			
			System.out.println("====3");
			
			sum += arr[end];
			
			System.out.println("====4");
			
			if((end - start + 1) == k) {
				
				System.out.println("====5");
				maxSum = Math.max(maxSum, sum);
				sum = sum - arr[start];
				start++;
			}
			
			System.out.println("====6");
			end++;
			
		}
		
		return maxSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arr = [1,2,3,4,5,6];
		int arr[] = {1,2,3,4,5,6};
		int k = 2;
		System.out.println("maxSum of size k--> "+kSizeSubarraySum(arr, k));
		

	}

}
