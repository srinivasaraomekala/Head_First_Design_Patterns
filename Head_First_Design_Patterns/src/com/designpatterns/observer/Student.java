package com.designpatterns.observer;

public class Student implements Observer {
	
	private String studentName;
	

	public Student(String studentName) {
		super();
		this.studentName = studentName;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public void notification(String studentName, String professor, String course, String message) {
		System.out.println("Student Name:: "+studentName);
		System.out.println("Proffesor Name:: "+professor);
		System.out.println("Course:: "+course);
		System.out.println("Message:: "+message+"\n");
	}

}
