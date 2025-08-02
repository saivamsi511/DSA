package javaDsa;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;

public class hashmapusingstringliststudent {
public static void main(String[] args) {
	Student2 s = new Student2("vamsi", 20, 100);
	Student2 s1 = new Student2("sai", 21, 80);
	Student2 s2 = new Student2("king", 22, 90);

    // Create a list of students
    List<Student2> studentList = new ArrayList<>();
    studentList.add(s);
    studentList.add(s1);
    studentList.add(s2);

    // Create a LinkedHashMap with one key and the student list
    LinkedHashMap<String, List<Student2>> lhm = new LinkedHashMap<>();
    lhm.put("students", studentList);

    // Accessing each student separately from the map
    List<Student2> listFromMap = lhm.get("students");
    Student2 studentOne = listFromMap.get(0);
    Student2 studentTwo = listFromMap.get(1);
    Student2 studentThree = listFromMap.get(2);

    // Print each student
    System.out.println("Student One: " + studentOne);
    System.out.println("Student Two: " + studentTwo);
    System.out.println("Student Three: " + studentThree);
}
}
class Student2 {
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
	public Student2(String name, int age, int marks) {
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
		Student2 other = (Student2) obj;
		return age == other.age && marks == other.marks && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}
	
}