package org.student;

import org.department.Department;

public class Student extends Department{


	public void studentName() {
		
		System.out.println("Student name is Kenny");
	}
	public void studentDept() {
		 
		System.out.println("Kenny in Computer Dept");
	}
	public void studentId() {
		
		System.out.println("Student Id : A420080");

	}
	
	
	public static void main(String[] args) {
		
		Student std = new Student();
		std.studentName();
		std.studentDept();
		std.studentId();
		std.deptName();
		std.collegeName();
		std.collegeCode();
		std.collegeRank();
		
		
		
	}
	
}
