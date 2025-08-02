package javaDsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class collectionreversemethod {
public static void main(String[] args) {
	ArrayList al  = new ArrayList();
	al.add(100);
	al.add(102);
	al.add(200);
	al.add(1);
	al.add(2);
	al.add(9999);
	System.out.println(al);
	Collections.sort(al);
	System.out.println(al);
	
	
//	Comparator<Integer> ans = Collections.reverseOrder();
	Collections.sort(al,new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			if(o1 > o2) {
				return -1;
			}
			else if(o1 < o2) {
				return 1;
			}
			else {
				return 0;
			}
		}
		
	});
	System.out.println(al);
}
}
