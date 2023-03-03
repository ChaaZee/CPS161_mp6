package registration;

import java.util.*;

public class Faculty extends Person {
	private String department;
	private String office;
	
	public Faculty(String name, int age, String email, String department, String office) {
		super(name, age, email);
		this.department = department;
		this.office = office;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public String toString() {
		return super.toString() + "Department: " + department + "\nOffice: " + office + "\n";
	}
}
