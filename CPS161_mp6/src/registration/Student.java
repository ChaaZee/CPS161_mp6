package registration;

import java.util.*;

public class Student extends Person {
	private String major;
	private double gpa;
	
	public Student(String name, int age, String email, String major, double gpa) {
		super(name, age, email);
		this.major = major;
		this.gpa = gpa;
	}
	
	public void registerCourse(Course c) {
		c.addStudent(this);
	}
	
	public String toString() {
		return super.toString()+ "Major: " + major + "\nGPA: " + gpa + "\n";
	}
}
