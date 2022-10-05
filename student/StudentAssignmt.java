package org.student;

import org.department.Department;

public class StudentAssignmt extends Department{


	public void getStudentInfo(int A) {
		
		System.out.println("Student ID is:"+A);
	}
	public void getStudentInfo(int A , String B) {
		 
		System.out.println("Student Id is:" + A +"\nStudent Name is :"+ B);
	}
	public void getStudentInfo(String C, String D) {
		
		System.out.println("Student email & Phone is :"+C+D);

	}
	
	
	public static void main(String[] args) {
		
		StudentAssignmt std = new StudentAssignmt();
		std.getStudentInfo(1001);
		std.getStudentInfo(1001, "Kenn");
		std.getStudentInfo("abc@bbc.com", "\n9962034234");
		
		
		
	}
	
}
