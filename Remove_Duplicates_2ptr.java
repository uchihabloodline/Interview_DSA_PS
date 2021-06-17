
package java_start;
import java.util.*;

public class Remove_Duplicates_2ptr {
	
	public static int removeDup(int[] arr, int size) {
		int low = 0, high = 1;
		while(high < size) {
			if(arr[low] == arr[high]) {
				high+=1;
			}
			if(arr[low] != arr[high]) {
				low += 1;
				arr[low] = arr[high];
			}
			++high;
		}
		
		
		return low+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {0,1,1,1,2,2,2,3,4,5};
		int size = arr.length;
		int res = removeDup(arr,size);
		System.out.print("ans-> "+res);

	}

}
