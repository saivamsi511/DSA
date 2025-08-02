package javaDsa;

import java.util.ArrayList;
import java.util.Collections;

public class Collectionsclasses {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	ArrayList all = new ArrayList();
	all.add(100);
	all.add(200);
	all.add(300);
	all.add(400);
	al.add("vamsi");
	al.add(100);
	al.add(true);
	al.add(false);
	al.add(3.12);
	al.add('a');
	al.add("200");
	System.out.println(al);
	Collections.sort(al);
System.out.println(al);
	
}
}
