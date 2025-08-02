package javaDsa;
import java.util.*;
public class multiplelists {
public static void main(String[] args) {
	LinkedList<Integer> ll1 = new LinkedList<Integer>();
	ll1.add(100);
	ll1.add(200);
	ll1.add(300);
	
	LinkedList<Integer> ll2 = new LinkedList<Integer>();
	ll2.add(400);
	ll2.add(500);
	ll2.add(600);
	
	LinkedList<Integer> ll3 = new LinkedList<Integer>();
	ll3.add(700);
	ll3.add(800);
	ll3.add(900);
	
	ArrayList<List> al = new ArrayList<List>();
	al.add(ll1);
	al.add(ll2);
	al.add(ll3);
	System.out.println(al);
	
	for(List x:al) {
		for(int i=0;i<x.size();i++) {
			System.out.print(x.get(i) + " ");
		}
		System.out.println();
	}
}
}
