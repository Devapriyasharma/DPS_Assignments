package org.college;

import org.department.Department;

public class College extends Department{

	public void collegeName() {
		System.out.println("College Name : Mepco Schlenk Engineering College");
	}
	
	public void collegeCode() {
		System.out.println("College Code : 4960");
	}
	
	public void collegeRank() {
		System.out.println("College Rank : 3.9");
	}
	
}
//Package   :org.college
//Class     :College
//Methods   :collegeName(),collegeCode(),collegeRank()
//
//Package   :org.department
//Class        :Department
//Methods   :deptName()
//
//Package   :org.student
//Class        :Student
//Methods   :studentName(),studentDept(),studentId()
//
//Description:
//create above 3 class and call all your class methods into the Student using multilevel inheritance.