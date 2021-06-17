package java_start;

import java.util.ArrayList;

public class MajorityElements2 {
	// [10, 10, 20, 30, 10, 10]
	public static ArrayList<Integer> majorityElementBestApproach(int arr[]){
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		int count1 = 0;
		int count2 = 0;
		int n = arr.length;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == first) {
				count1 +=1;
			}else if(arr[i] == second) {
				count2 += 1;
			}else if(count1 == 0) {
				first = arr[i];
				count1 = 1;
			}else if(count2 == 0) {
				second  = arr[i];
				count2 = 1;
			}else {
				count1 -- ;
				count2 -- ;
			}
		}
		
		// To store answers
		ArrayList<Integer> ans = new ArrayList<Integer>();
		count1 = 0;
		count2 = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(first == arr[i]) {
				count1+=1;
			}
			if(second  == arr[i]){
				count2+=1;
			}
		}
		
		if(count1 > n/3) {
			ans.add(first);
		}
		if(count2 > n/3) {
			ans.add(second);
		}
		
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10, 10, 20, 30, 10, 10};
		ArrayList ans = majorityElementBestApproach(arr);
		
		for(int i =0; i<ans.size(); i++) {
			System.out.println(ans.get(i));
		}
	}

}
