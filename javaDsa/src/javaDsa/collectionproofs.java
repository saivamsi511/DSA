package javaDsa;
import java.util.*;
public class collectionproofs {
public static void main(String[] args) {
	//duplicates are allowed
	//same as inserted
	//null value also  possible
	//yes traditional for loop possible
	List ll = new ArrayList();
	ll.add(100);
	ll.add(200);
	ll.add(500);
	ll.add(300);
	System.out.println(ll);
	ll.add(null);
	ll.add(100);
	for(int i=0;i<ll.size();i++) {
		System.out.println(ll.get(i));
	}
	
	System.out.println("==========================");
	//duplicates are allowed
	//same as inserted
	//null value also  possible
	//yes traditional for loop possible
	List l = new LinkedList();
	l.add(100);
	l.add(200);
	l.add(500);
	l.add(300);
	System.out.println(l);
	l.add(null);
	l.add(100);
	System.out.println(l);
	for(int i=0;i<l.size();i++) {
		System.out.println(l.get(i));
	}
	
	System.out.println("==========================");
	//duplicates are allowed
	//same as inserted
	//null value are not possible
	//no traditional for loop possible
	Queue q = new ArrayDeque();
	q.add(100);
	q.add(200);
	q.add(500);
	q.add(300);
	System.out.println(q);
//	q.add(null); //null is also not possible
	q.add(100);
	System.out.println(q);
//	for(int i=0;i<q.size();i++) {
//		System.out.println(q.get(i)); // not possible becase get method is not availble in queue
//	}
	
	System.out.println("==========================");
	//duplicates are allowed
	//the order is not same as preserved
	//null value not  possible
	//no traditional for loop possible
	Queue w = new PriorityQueue();
	w.add(100);
	w.add(200);
	w.add(500);
	w.add(300);
	System.out.println(w);
//	w.add(null); //null is also not possible
	w.add(100);
	System.out.println(w);
//	for(int i=0;i<w.size();i++) {
//		System.out.println(w.get(i)); // not possible becase get method is not availble in queue
//	}
	
	System.out.println("==========================");
	//duplicates are not allowed
	//result in sorted order
	//null value not  possible
	//traditional for loop not possible
	TreeSet t = new TreeSet();
	t.add(100);
	t.add(200);
	t.add(500);
	t.add(300);
	System.out.println(t);
//	t.add(null);
	t.add(100);
	System.out.println(t);
//	for(int i=0;i<t.size();i++) {
//		System.out.println(t.get(i));
//	}
	
	System.out.println("==========================");
	//duplicates are not allowed
	//same as inserted - no    
	//null value also  possible
	//traditional for loop not possible
	HashSet hs = new HashSet();
	hs.add(100);
	hs.add(500);
	hs.add(200);
	hs.add(300);
	System.out.println(hs);
	hs.add(null);
	hs.add(100);
	System.out.println(hs);
//	for(int i=0;i<hs.size();i++) {
//		System.out.println(hs.get(i)); 
//	}
	
	
	System.out.println("==========================");
	//duplicates are not allowed
	//same as inserted
	//null value also  possible
	//traditional for loop not possible
	LinkedHashSet lh = new LinkedHashSet();
	lh.add(100);
	lh.add(500);
	lh.add(200);
	lh.add(300);
	System.out.println(lh);
	lh.add(null);
	lh.add(100);
	System.out.println(lh);
//	for(int i=0;i<lh.size();i++) {
//		System.out.println(lh.get(i)); 
//	}
}
}
