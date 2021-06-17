package java_start;

/*
 Params:
 *
 N: (int) Size of array having stalls at respective distances.
 C: (int) number of cows. Could be between [2,n].
 stalls: (int[]) Array containing list of stalls for placing cows.
 */
public class AggresiveCows {
	public static int C = 3;

	public static boolean canPlaceCows(int minimumDist, int[] stalls) {
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
		int resultantStall = binarySearch(stalls);
		
		System.out.println("Maximum minimum distance-> "+resultantStall);

	}

}
