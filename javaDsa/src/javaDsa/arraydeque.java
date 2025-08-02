package javaDsa;

import java.util.ArrayDeque;
import java.util.Iterator;

public class arraydeque {
public static void main(String[] args) {
	ArrayDeque ad = new ArrayDeque();
	ad.add(100);
	ad.add(200);
	ad.add(300);
	ad.add(400);
	ad.addLast(500);
	ad.addFirst(600);
	
	System.out.println(ad);
	
//	for(int i=0;i<ad.size();i++) {
//		System.out.println(ad. + " ");
//	}
	
	for(Object i : ad) {
		System.out.println(i + " ");
	}
	
	System.out.println(ad.contains(100));
	System.out.println(ad.getFirst());
	System.out.println(ad.getLast());
	System.out.println(ad.isEmpty());
	System.out.println(ad.peek());
	System.out.println(ad);
	System.out.println(ad.poll());
	System.out.println(ad);
//	System.out.println(ad.iterator());

}
}
