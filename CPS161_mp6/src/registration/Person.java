package registration;

import java.util.*;

public class Person {
	private String name;
	private int age;
	private String email;
	
	public Person(String name, int age, String email) {
		this.name = name;
		this.age = age;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getAge() {
		return age;
	}
	
	public boolean equals(Person p) {
		if(this.getName() == p.getName() && this.getEmail() == p.getEmail() && this.getAge() == p.getAge()) {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		return name + "\nAge: " + age + "\nEmail: " + email + "\n";
	}
}
