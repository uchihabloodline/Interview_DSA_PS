package java_start;

import java.util.ArrayList;

public class ArrayList_funcs {
	
	public static ArrayList<Integer> removeDuplicatefromList(ArrayList<Integer> arr){
		// {1,2,2,3,4,4,5,6}
		int arrLen = arr.size();
		int boolArr[] = new int[arrLen+1];
		
		for(int i=0; i< arrLen-1; i++) {
			int boolNum = arr.get(i);
			if(boolArr[boolNum] > 0) {
				arr.remove(boolNum);
			}else {
			boolArr[boolNum]+=1;
			}
			
			for(int iter=0;i<boolArr.length;i++) {
				if(boolArr[i]>1) {
					arr.remove(boolArr[i]);
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(4);
		arr.add(5);
		arr.add(6);
		
		for(Integer iter:arr) {
			System.out.print(iter+" ");
		}
		
		ArrayList<Integer> result = removeDuplicatefromList(arr);
		
		//resultant array
		for(Integer iter2:result) {
			System.out.print("resultant array");
			System.out.print(iter2+" ");
		}

	}

}
