package java_start;

import java.util.*;

public class LinkedListInbuilt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l1 = new LinkedList<>();
		l1.add(3);
		l1.addFirst(1);
		l1.add(2);
		l1.add(6);
		l1.addLast(11);
		l1.addFirst(22);
		
		System.out.print(l1);
		
		l1.remove(2);  			//pass the index
		
		System.out.print(l1);

	}

}
