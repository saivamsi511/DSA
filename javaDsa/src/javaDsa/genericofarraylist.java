package javaDsa;

import java.util.ArrayList;
import java.util.Scanner;

public class genericofarraylist {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
//	int n = sc.nextInt();
//	String type = sc.next();
	
//	if(type.equals("Integer")) {
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		for(int i=0;i<n;i++) {
//			arr.add(sc.nextInt());
//		}
//		
//		System.out.println(arr.size());
//		
//		System.out.println("Elements: ");
//		for(Object i:arr) {
//			System.out.println(i);
//		}
//	}
	
	ArrayList arr = new ArrayList();
	arr.add("sai");
	arr.add("vamsi");
	ArrayList arr1 = new ArrayList();
	arr1.add("king");
	arr1.add("atul");
	
	System.out.println(arr1.get(0));
	ArrayList arr2 = new ArrayList();
	
	arr2.addAll(arr);
	arr2.addAll(arr1);
	System.out.println(arr2);
}
}
