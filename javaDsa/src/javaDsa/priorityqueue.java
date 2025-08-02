package javaDsa;
import java.util.*;
//import java.util.priorityQueue;
public class priorityqueue {
public static void main(String[] args) {
	PriorityQueue pq = new PriorityQueue();
	pq.add(100);
	pq.add(50);
	pq.add(25);
	pq.add(75);
	pq.add(155);
	pq.add(125);
	
	System.out.println(pq);
	
	System.out.println(pq.contains(100));
	System.out.println(pq.isEmpty());
	System.out.println(pq.remove(100));
	System.out.println(pq.size());
	System.out.println(pq.toArray());
	
	Iterator it = pq.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
//	System.out.println();
}
}
