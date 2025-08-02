package javaDsa;

import java.util.LinkedList;
import java.util.Scanner;

public class linkedlist {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	LinkedList ll = new LinkedList();
	LinkedList l2 = new LinkedList();
//	ll.containsAll(l2)
//	int n = sc.nextInt();
//	
//	for(int i=1;i<n+2;i++) {
//		String s = sc.nextLine();
//		ll.add(s);
//	}
//	for(int i=1;i<n+1;i++) {
//		System.out.println(ll.get(i) + " ");
//	}
	
	ll.add(100);
	ll.add(200);
	ll.add(300);
	ll.add(400);
	ll.add(500);
	ll.add(600);
	
	System.out.println(ll);
	System.out.println(ll.contains(100));
	System.out.println(ll.get(2));
	System.out.println(ll.indexOf(200));
	System.out.println(ll.isEmpty());
	System.out.println(ll.peek());
	System.out.println(ll);
	System.out.println(ll.poll());
	System.out.println(ll);
	ll.remove(2);
	System.out.println(ll);
	ll.set(1, 900);
	System.out.println(ll);
	System.out.println(ll.size());
	
	l2.addAll(ll);
	System.out.println(l2);
	System.out.println(l2.containsAll(ll));
	System.out.println(l2);
}
}
