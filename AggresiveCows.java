package java_start;
import java.util.Arrays;

/*
 Params:
 *
 N: (int) Size of array having stalls at respective distances.
 C: (int) number of cows. Could be between [2,n].
 stalls: (int[]) Array containing list of stalls for placing cows.
 */

//Is the respective optimal stall number possible?? lets check it here below.
public class AggresiveCows {
	public static int C = 3;

	public static boolean canPlaceCows(int minimumDist, int[] stalls) {
		//atlest 1 cow will be placed, Ofcourse.
		int cows = 1;
		int pos = stalls[0];
		
		for(int i=1; i<stalls.length; i++) {
			if(stalls[i]-pos >= minimumDist) {
				pos = stalls[i];
				cows+=1;
				if(cows == C) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	//Finding optimal stall using monotonic behaviour of BS
	public static int binarySearch(int []stalls){
		int low = 0;
		int high = stalls.length - 1;
		int maxMinValue = -1;
		
		while(low < high) {
			int mid = low + (high-low)/2;
			if(canPlaceCows(mid, stalls) == true) {
				low = mid+1;
				maxMinValue = mid;
			}
			else {
				high = mid-1;
			}
		}
		
		return maxMinValue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stalls[] = {1,2,4,8,9};
		
		//A sorted is a must to use monotonic behaviour of Binary search.
		Arrays.sort(stalls);
		
		//returns the maximum minimum distance of placing all cows/wolfs/elephants/dragons!
		int resultantStall = binarySearch(stalls);
		
		System.out.println("Maximum minimum distance-> "+resultantStall);

	}

}
