package org.student;

import org.college.College;

public class Student extends College{

	public void studentName() {
		System.out.println("Name: Devapriya Sharma");
	}

	public void studentDept() {
		
		System.out.println("Department: EEE - PED ");

	}

	public void studentID() {
		System.out.println("ID: 123456 ");
	}
	
	
	public static void main(String[] args) {
		Student obj = new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentDept();
		obj.studentID();
	}

}
//Methods   :studentName(),studentDept(),studentId()