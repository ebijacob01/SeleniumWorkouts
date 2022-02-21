package org.student;

import org.department.Department;
public class Student extends Department{
	public void studentName() {
		System.out.println("Ebinazer");
		
	}
	public void studentDept() {
		System.out.println("ECE");
	}
	public void studentId() {
		System.out.println("41221710");
	}
	
public static void main(String[] args) {
		Student type=new Student();
		type.collegeName();
		type.collegeCode();
		type.collegeRank();
		type.deptName();
		type.studentName();
		type.studentDept();
		type.studentId();
		
	}

}
