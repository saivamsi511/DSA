package javaDsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class comparatorclass {
	public static void main(String[] args) {
		ArrayList<student> al = new ArrayList<>();
		al.add(new student("vamsi",192));
		al.add(new student("sai",20));
		al.add(new student("atul",21));
		al.add(new student("king",22));

		//lambda comparator operator
//		Collections.sort(al,(s1,s2) -> {
//			student a = (student) s1;
//			student b = (student) s2;
//			//for integer values
//			//		return Integer.compare(a.age, b.age);
//			//for strings
//			return a.name.compareTo(b.name);
//		});
		
		//another class creation
//		Collections.sort(al,new demo());
		
		//creating new comparatorr method
		Collections.sort(al,new Comparator<student>() {
			public int compare(student o1, student o2) {
				return Integer.compare(o1.age, o2.age);
			}
			
		});
		System.out.println(al);
		
	}
}
class student{
	String name;
	int age;
	public student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "name: " + name + " age " + age;
	}
	
}
class demo implements Comparator<student> {

	@Override
	public int compare(student o1, student o2) {
		return o1.name.compareTo(o2.name);
	}
	
}

