package javaDsa;
import java.util.*;
public class Hashset {
public static void main(String[] args) {
	HashSet hs = new HashSet();
	hs.add(100);
	hs.add(200);
	hs.add(300);
	hs.add(50);
	hs.add(40);
	hs.add(90);
	String[] arr = {"sai" , "100"};
	System.out.println(hs);
	System.out.println(hs.contains(100));
	System.out.println(hs.equals(100));
	System.out.println(hs.isEmpty());
	System.out.println(hs.remove(arr[1]));
	System.out.println("=============================");
	System.out.println(hs.size());
	System.out.println(hs.toArray());
	System.out.println(hs.iterator());
	Object[] vamsi = hs.toArray();
	for(int i=0;i<hs.size();i++) {
		System.out.println(vamsi[i]);
	}
	
	for(Object i:hs) {
		System.out.println(i);
	}
	
	Iterator it = hs.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
}
}
