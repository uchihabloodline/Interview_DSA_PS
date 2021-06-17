package java_start;
import java.lang.Math;

public class ContainerWithMostWater {
	
	//O(n) approach, else it can be done in O(N^2) by 2 loops.
	public static int maxContainerFind(int [] input, int n ) {
		
		int l = 0;
		int r = input.length - 1;
		int maxArea = 0;
		
		while(l < r) {
			maxArea = Math.max(maxArea, Math.min(input[l], input[r])*(r-l));
			
			if(input[l] < input[r]) {
				l++;
			}else {
				r--;
			}
		}
		
		return maxArea;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int b[] = {3, 1, 2, 4, 5};
		int len = b.length;
		int result = maxContainerFind(b,b.length);
		
		System.out.println("max container area -> "+result);

	}

}
