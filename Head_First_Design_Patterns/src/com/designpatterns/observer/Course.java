package com.designpatterns.observer;

public interface Course {
	public void addCourseSubcriber(Student student);
	public void removeCourseSubcriber(Student student);
	public void notifyCourseSubscribers(String message);
}
