package java_start;
import java.util.*;

public class findUnique {
	
	public static int findTriplet(int[] arr, int x) {
    	//Your code goes here
		System.out.print("====");
        Arrays.sort(arr);
  
        int l ,r;
        int count = 0;
        for(int i=0;i<arr.length-2;i++){
            l = i+1;
            r = arr.length-1;
            System.out.print("====");
            
            while(l < r){
            	System.out.print("====");
                if(arr[i]+arr[l]+arr[r] == x){
                    count += 1;
                    
                }
             
                else if(arr[i]+arr[l]+arr[r] < x){
                    l += 1;
                    System.out.print("====");
                }
              
                else {
                    r -= 1;
                }
            }
        }
        System.out.print("====");
        return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {1,2,5,3,5,2,7,8,3,1,22,5};
		int x = 9;
		int ans = findTriplet(arr,x);
		System.out.print("count of triplets--> "+ans);

	}

}
