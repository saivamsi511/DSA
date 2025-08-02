package javaDsa;

import java.util.ArrayList;

public class Arraylistex {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add(10); // 
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(true);
		arr.add(3.12);
		arr.add(3323.22f);
		arr.add('s');
		arr.add("sai");
		System.out.println(arr);
		
		System.out.println("==================");
		
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		System.out.println("==========");
		
		for(Object x:arr) {
			System.out.println(x);
		}
		System.out.println("==================");
		
		arr.add(2,999); // add push the value at give index to next element and at that index
		System.out.println(arr); 
		
		System.out.println("==================");
		arr.set(2, 99999); // set replaces the value at given index to the given value
		System.out.println(arr);
		
		System.out.println(arr.get(2));
		System.out.println(arr.remove(2));
		System.out.println(arr);
//		System.out.println(a);
		System.out.println(arr.indexOf(10));
		System.out.println(arr.isEmpty());
		System.out.println(arr.toString());
		System.out.println(arr.contains(10));
		System.out.println(arr.subList(1, 3));
	}
}
