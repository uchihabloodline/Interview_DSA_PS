package java_start;

public class X_To_The_Power_Y_BOTH_METHOD {
	
	// For positive powers only.
	static int XtoPowerY(int x, int y) {
		int i=1;
		
		System.out.println("iteration-> "+i++ +" "+ x+" "+y);
		
		if(y == 0) {
			return 1;
		}
		
		if(x == 0) {
			return 0;
		}
		
		return x * XtoPowerY(x, y-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 2;
		int y = 3;
		
		int result = XtoPowerY(x,y);
		System.out.println("result--> "+result);
	}

}
