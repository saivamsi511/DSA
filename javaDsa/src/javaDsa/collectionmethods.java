package javaDsa;

import java.util.ArrayList;
import java.util.Collections;

public class collectionmethods {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add(100);
	al.add(200);
	al.add(300);
	al.add(400);
	al.add(500);
	al.add(100);
	
	Collections.sort(al);
	System.out.println(al);
	System.out.println(Collections.binarySearch(al,100));
	System.out.println(Collections.replaceAll(al, 100, 9999));
	System.out.println(Collections.frequency(al, 9999));
	System.out.println(Collections.min(al));
	System.out.println(Collections.max(al));
	Collections.reverseOrder();
	Collections.shuffle(al);
	System.out.println(al);
	Collections.swap(al, 0, 1);
	System.out.println(Collections.singleton(al));
	Collections.rotate(al, 3);
	Collections.emptyList();
	Collections.fill(al, 100);
	System.out.println(al);
	
}
}
