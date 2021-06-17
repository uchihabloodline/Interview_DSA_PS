package java_start;

import java.util.*;

public class Three_sum_DS {
	
	public static int binarySearch(int arr[], int l, int r, int x) {
		if(r >= l) {
			int mid = l + ((r - l)/2);
		
		if(x == arr[mid]) {
			return mid;
		}
		
		if(x > arr[mid]) {
			return binarySearch(arr,mid+1,r,x);
		}
		
		if(x < arr[mid]) {
			return binarySearch(arr,l,mid-1,x);
		}
		
	}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,9,111,1111};
		int l = 0, r = arr.length-1;
		int x = 5;
		
		int resultPosition = binarySearch(arr,l,r,x);
		
		System.out.print("Index found--> "+resultPosition);
		
	}

}
