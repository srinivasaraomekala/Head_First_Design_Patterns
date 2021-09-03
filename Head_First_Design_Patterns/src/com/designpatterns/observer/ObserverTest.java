package com.designpatterns.observer;

public class ObserverTest {
	public static void main(String[] args) {
		Professor professor = new Professor("Prof1", "Course1");
		
		Student studentA =new Student("StudentA");
		Student studentB =new Student("StudentB");
		Student studentC =new Student("StudentC");
		professor.addCourseSubcriber(studentA);
		professor.addCourseSubcriber(studentB);
		professor.addCourseSubcriber(studentC);
		
		professor.notifyCourseSubscribers("Hello Students");
	}
}



