package javaDsa;

import java.util.Stack;

public class stack {
public static void main(String[] args) {
	Stack s = new Stack();
	s.add(100);
	s.add(200);
	s.add(300);
	s.add(400);
	s.push(500);
	s.pop();
	System.out.println(s);
	System.out.println(s.capacity());
	System.out.println(s.contains(500));
	System.out.println(s.empty());
	System.out.println(s.equals(1));
	System.out.println(s.get(2));
	System.out.println(s.indexOf(100));
	System.out.println(s.peek());
	System.out.println(s);
	System.out.println(s.remove(2));
	System.out.println(s.set(0, 600));
	System.out.println(s);
	System.out.println(s.search(200));
	System.out.println(s.size());
//	System.out.println(s.);
}
}
