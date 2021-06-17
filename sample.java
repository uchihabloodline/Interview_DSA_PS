package java_start;

public class sample {
	public static void main(String args[]) {
		int[] arr = {1,1,1,1,1,0,1,0,0,1};
		int arr_len = arr.length;
		int count_0 = 0, count_1 = 0;
		for(int i=0;i<arr_len;i++) {
			if(arr[i] == 0) {
				count_0 += 1;
			}
			if(arr[i] == 1) {
				count_1 += 1;
			}
		}
		
		for(int i=0; i<count_0;i++) {
			arr[i] = 0;
		}
		for(int i = count_0;i<arr_len;i++) {
			arr[i] = 1;
		}
		
		for(int iter : arr) {
			System.out.print(iter);
		}
		
	}
}
