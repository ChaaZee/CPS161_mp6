package registration;

import java.util.*;

public class Course {
	private String department;
	private String courseName;
	private int maxClassSize;
	private int currentEnrollmentNumber;
	private ArrayList<Student> roster = new ArrayList<Student>();
	private Faculty instructor;
	
	public Course(String department, String courseName, int maxClassSize) {
		this.department = department;
		this.courseName = courseName;
		this.maxClassSize = maxClassSize;
	}
	
	public void assignInstructor(Faculty i) {
		if(department == i.getDepartment()) {
			instructor = i;
			System.out.println("Assigned " + i.getName() + " to this course");
		} else {
			System.out.println("Can't assign intructor " + i.getName() + " to this course");
		}
	}
	
	public void addStudent(Student s) {
		boolean inClass = false;
		for(int i = 0; i < roster.size(); i++) {
			if(roster.get(i).equals(s)) {
				inClass = true;
			}
		}
		
		if(roster.size() < maxClassSize && !inClass) {
			roster.add(s);
			currentEnrollmentNumber += 1;
			System.out.println("Added " + s.getName() + " to this course");
		} else {
			System.out.println("Unable to add " + s.getName() + " to course");
		}
	}
	
	public void displayRoster() {
		if(currentEnrollmentNumber != 0) {
			System.out.println("---------- Roster ----------");
			for(int i = 0; i < roster.size(); i++) {
				System.out.println(roster.get(i).getName());
			}
			System.out.println("----------------------------");
		} else {
			System.out.println("No students currently enrolled");
		}
	}
	
	public String toString() {
		return "Course: " + courseName + "\nDepartment: " + department + "\nMax Class Size: " + maxClassSize + "\nCurrent Enrollment Number: " + currentEnrollmentNumber + "\nInstructor: " + instructor + "\n";
	}
}
