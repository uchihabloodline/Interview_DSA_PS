package java_start;
import java.util.*;

public class MaxFreqChars {
	
	public static HashMap<Character, Integer> maxFreq(String input) {
		
		
		// test string - aatttrennaaavvcc
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i=0 ; i<input.length(); i++) {
			int charCount = 1;
			map.put(input.charAt(i), charCount);
			for(int j=i+1; j<input.length();j++) {
				if(input.charAt(j) != input.charAt(i)) {
					i = j;
					break;
				}
				if(input.charAt(j) == input.charAt(i)) {
					charCount +=1;
					map.put(input.charAt(i), charCount);
				}
				
			}
		}
		
		return map;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// test string - aatttrennaaavvcc
		String input =  "aatttrennaaavvcc";
		
		HashMap<Character, Integer> result = maxFreq(input);
		
		

	}

}
