package org.student;

import org.department.Department;

public class Student extends Department {
public void StudentName()
{
	System.out.println("student name"+" PRIYANKA");
}
public void StudentDepartment()
{
	System.out.println("student department "+" ECE");
}
public void StudentId()
{
	System.out.println("student id "+" 101");
}
	public static void main(String[] args) {
		Student su=new Student();
		su.CollegeCode();
		su.collegeName();
		su.CollegeRank();
		su.DepartmentName();
		su.StudentDepartment();
		su.StudentId();
		su.StudentId();

	}

}
