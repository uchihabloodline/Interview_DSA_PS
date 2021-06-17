package java_start;

public class PallindromeString {
	
	public static boolean pallindromic(String str) {
		//two ptr approach
		// "madam"
		int length = str.length();
		int low = 0;
		int high = length-1;
		while(low < high) {
			if(str.charAt(low) != str.charAt(high)) {
				return false;
			}
			low+=1;
			high-=1;
		}
		
		//if nothing gets wrong then we have the pallindrome
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "madam";
		boolean result = pallindromic(str);
		System.out.print("result--> "+result);

	}

}
