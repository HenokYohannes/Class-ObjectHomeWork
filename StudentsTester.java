package com.syntax.com15;

public class StudentsTester {

	public static void main(String[] args) {
		
	Students std=new Students();
	
	std.studentName="Muzit";
	std.studentID=3145;
	std.numberOfStudents=45;
	
	System.out.println("The name of the student is "+std.studentName+" and her std.ID is "+std.studentID+ " and the # of students are " +std.numberOfStudents);
	
	Students std1=new Students();
	
	std1.studentName="Sky";
	std1.studentID=2235;
	std1.numberOfStudents=28;
	System.out.println("The name of the student is "+std1.studentName+" and her std.ID is "+std1.studentID+ " and the # of students are " +std1.numberOfStudents);
	
	Students std2=new Students();
	
	std2.studentName="Pepa";
	std2.studentID=2814;
	std2.numberOfStudents=59;
	System.out.println("The name of the student is "+std2.studentName+" and her std.ID is "+std2.studentID+ " and the # of students are " +std2.numberOfStudents);
	
	
	
	
	
	}

}
