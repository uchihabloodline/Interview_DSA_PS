package java_start;
import java.util.*;

public class ThreeSumProblem {

	static Set<Integer> threeSum(int [] arr) {
		
		/*
		 * a+b+c = 0 , hence
		 * b+c = -a , hence the 3 pointers
		 */
		
		Set<Integer> set = new HashSet<>();
		// a+b+c = 0
		int ptrA = 0;
		int ptrB = 1;
		int ptrC = arr.length-1;
		
		// b+c = -a
		while(ptrB != ptrC) {
			if(arr[ptrA]+arr[ptrB]+arr[ptrC] == 0 && 
					!set.contains(ptrA) && !set.contains(ptrA) && !set.contains(ptrA)) {
				set.add(arr[ptrA]);
				set.add(arr[ptrB]);
				set.add(arr[ptrC]);
				ptrB+=1;
				ptrC-=1;
			}
			
			else if(arr[ptrA]+arr[ptrB]+arr[ptrC] < 0) {
				ptrB+=1;
			}
			else {
				ptrC-=1;
			}
			
		}
		
		
		return set;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// array = {-2,-2,-1,-1,-1,0,0,0,2,2,2}
		
		int arr[] = {-2,-2,-1,-1,-1,0,0,0,2,2,2};
		// NOTE: SORTED ARRAY is needed for this equation approach.
		Arrays.sort(arr);
		Set<Integer> resultantSet = threeSum(arr);
		
		System.out.println("result--> "+ resultantSet);

	}

}
