package com.springrest.springrest.Services;

import java.util.List;

import com.springrest.springrest.entities.Course;

public interface CourseService {
	
	public List<Course> getCourses();

	public Course getCourse(String courseId);

	public Course getCourse(long courseId);

	public Course addCourse(Course course);
}
