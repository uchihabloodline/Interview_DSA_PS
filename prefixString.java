package java_start;

public class prefixString {
	
	 /* Input:  technique, technician, technology, technical
		   Output: The longest common prefix is techn
		 */
	
	public static int minLength(String arr[], int n) {
		int min = arr[0].length();
		
		//iterate over chars of string
		for(int i=1;i<n;i++) {
			if(arr[i].length() < min) {
				min = arr[i].length();
			}
		}
		
		return min;
	}
	
	
	public static String commonPrefix(String arr[], int n) {
		int minLengthString = minLength(arr,n);
		
		int currentValue = 0;
		String result = "";
		
		for(int i=0;i<minLengthString; i++) {
			currentValue = 
		}
		
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Input:  technique, technician, technology, technical
		   Output: The longest common prefix is techn
		 */
		
		String arr[] = {"technique", "technician", "technology", "technical", "tech"};
		
		
		

	}

}
