package java_start;
import java.lang.*;


public class ParcelDeliver {
	
	public static boolean isValidAnswer(int arr[], int k, int ans) {
		int warehouseLocation = arr[0]+ans;
		int totalWareHouse = 1;
		
		for(int i=0;i<arr.length;i++) {
			if(Math.abs(arr[i]-warehouseLocation) <= ans) {
				continue;
			}
			
			totalWareHouse++;
			warehouseLocation = arr[i]+ans;
			
			if(totalWareHouse > k) {
				return false;
			}
		}
		
		return true;
	}
	
	public static int findMinTime(int arr[], int k) {
		int min = 0, max = Integer.MAX_VALUE;	
		int mid = 0;
		
		while(min <= max) {
			mid = (min+max)/2;
			
			if(isValidAnswer(arr,k,mid) == true) {
				max = mid-1;
			}
			else {
				min = mid+1;
			}
		}
		return mid;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2,9,15,22,58,63
		int arr[] = {1,6,12};
		
		int k = 1;
		
		int ans = findMinTime(arr,k);
		
		System.out.print("answer-> "+ans);

	}

}
