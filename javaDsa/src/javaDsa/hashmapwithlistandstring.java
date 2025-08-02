package javaDsa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashmapwithlistandstring {
public static void main(String[] args) {
	ArrayList<Integer> al1 = new ArrayList<Integer>();
	al1.add(100);
	al1.add(200);
	al1.add(300);
	
	ArrayList<Integer> al2 = new ArrayList<Integer>();
	al2.add(400);
	al2.add(500);
	al2.add(600);
	
	ArrayList<Integer> al3 = new ArrayList<Integer>();
	al3.add(700);
	al3.add(800);
	al3.add(900);
	
	HashMap<String, List> hm = new HashMap<String, List>();
	hm.put("first", al1);
	hm.put("second", al2);
	hm.put("third", al3);
	
	System.out.println(hm);
	Set<Entry<String,List>> s = hm.entrySet();
	for(Map.Entry<String, List> x : s) {
		System.out.println(x.getKey() + " " + x.getValue());
	}
	
	System.out.println("=======================");
	for (var entry : hm.entrySet()) {
	    System.out.println(entry.getKey() + " -> " + entry.getValue());
	}
	
	System.out.println("=======================");
	LinkedHashMap<String, List> lhm = new LinkedHashMap<String, List>();
	lhm.put("first", al1);
	lhm.put("second", al2);
	lhm.put("third", al3);
	
	System.out.println(lhm);
	
	for (var entry : lhm.entrySet()) {
	    System.out.println(entry.getKey() + " -> " + entry.getValue());
	}
}
}
