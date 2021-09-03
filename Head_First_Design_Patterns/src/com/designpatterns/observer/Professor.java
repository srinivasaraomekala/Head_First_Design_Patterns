package com.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Professor implements Course {
	private String profName;
	private String course;
	List<Student> students = new ArrayList<>();
	
	
	public Professor(String profName, String course) {
		super();
		this.profName = profName;
		this.course = course;
	}
	
	public String getProfName() {
		return profName;
	}
	public void setProfName(String profName) {
		this.profName = profName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	//Map student to a professor
	public synchronized void addCourseSubcriber(Student student) {
		students.add(student);
	}
	
	public synchronized void removeCourseSubcriber(Student student) {
		students.remove(student);
	}
	
	
	//post message
	public void notifyCourseSubscribers(String message) {
		System.out.println("Professor Posted Message:: "+message+"\n");
		students.forEach(student->student.notification(student.getStudentName(), this.profName, this.course, message));
	}
	
}
