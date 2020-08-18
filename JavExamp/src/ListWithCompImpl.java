import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class ListWithCompImpl {
	public static void main(String ar[]){
		List<Student> std = new ArrayList<Student>();
		std.add(new Student(1,62));
		std.add(new Student(2,88));
		std.add(new Student(3,55));
		std.add(new Student(4,70));
		std.add(new Student(5,44));
		
		
		std.forEach(System.out::println);
		
		// Collections.sort(std, (s1,s2) -> s1.marks > s2.marks ? -1 : s1.marks < s2.marks ? 1 : 0);
		Collections.sort(std);
		System.out.println("After Sorting ...");
		std.forEach(System.out::println);
	}
}

class Student implements Comparable<Student>{
	int rollNo;
	int marks;
	public Student(int rollNo, int marks) {
		super();
		this.rollNo = rollNo;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Student std) {
		// TODO Auto-generated method stub
		return this.marks > std.marks ? -1 : this.marks < std.marks ? 1 : 0;
	}
}