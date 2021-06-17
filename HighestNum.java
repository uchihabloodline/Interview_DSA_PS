package java_start;

public class HighestNum {
	
	public static int highestnum(int arr[]) {
		int maxNum = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		int len = arr.length;
		for(int iter = 0; iter<len; iter++) {
			if(arr[iter] > maxNum) {
				maxNum = arr[iter];
			}
		}
		
		//for second largest number
		for(int itr = 0; itr<len; itr++) {
			if(arr[itr] > secondMax) {
				if(arr[itr] != maxNum)
				secondMax = arr[itr];
			}
		}
		
		return secondMax;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,9,10,2};
		int result = highestnum(arr);
		System.out.print("result-->"+result);

	}

}
