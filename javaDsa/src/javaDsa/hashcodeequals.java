package javaDsa;

import java.util.HashSet;
import java.util.Objects;

public class hashcodeequals {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(new Student(20,"vamsi")); // this two are same but hashcode treats as diff objects
        hs.add(new Student(20,"vamsi")); // this can be solved by using hashcode and equals methos
        hs.add(new Student(21,"sai"));
        
        System.out.println(hs.size()); // give size 3 but we need 2
    }
}
class Student {
	int age;
	String name;
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	public boolean equals(Object o) {
		if(this == o) return true;
		
		Student s = (Student) o;
		if (age == s.age && name.equals(s.name)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int hashCode() {
		return Objects.hash(age,name);
	}
	
}
