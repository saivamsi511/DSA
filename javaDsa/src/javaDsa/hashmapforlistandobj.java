package javaDsa;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
public class hashmapforlistandobj {
	public static void main(String[] args) {
		Student1 s = new Student1("vamsi", 20, 100);
		Student1 s1 = new Student1("sai", 21, 80);
		Student1 s2 = new Student1("king", 22, 90);
		
		LinkedHashMap<String , Student1> lhm = new LinkedHashMap<String , Student1>();
		lhm.put("first", s);
		lhm.put("second", s1);
		lhm.put("third", s2);
		
		System.out.println(lhm);
		
		System.out.println("Student Map:");
		
		for (var entry : lhm.entrySet()) {
		    System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}
}
class Student1 {
	String name;
	int age;
	int marks;
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Student1(String name, int age, int marks) {
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, marks, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student1 other = (Student1) obj;
		return age == other.age && marks == other.marks && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}
	
}