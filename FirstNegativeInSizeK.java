package java_start;

public class FirstNegativeInSizeK {
	
	public static void FirstNegInKWindow(int [] arr, int k, int n) {
		int start = 0;
		int end = 0;
		
		while(end < n && start <= end) {
			
			if(end-start + 1 < k) {
				
				if(arr[start] < 0) {
					System.out.println(arr[start]+" ");
				}
			
			}
			
			if((end-start + 1) == k) {
				
				if(arr[start] < 0) {
					System.out.println(arr[start]+" ");
				}
				
				start++;
			}
			
			end++;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// [12, -1, -7, 8, -15, 30, 16, 28]
		
		int arr[] = {12, -1, -7, 8, -15, 30};
		int k = 3;
		int n = arr.length;
		FirstNegInKWindow(arr, k, n);
	}

}
