package com.springrest.springrest.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;

@Service
public class CourseImpl implements CourseService {
	
	
	List<Course> list;
	
	public CourseImpl() {
		
		list=new ArrayList<>();
		list.add(new Course(101,"java","core Java"));
		list.add(new Course(102,"Spring boot","basic spring boot"));
	}
	
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}


	@Override
	public Course getCourse(String courseId) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Course getCourse(long courseId) {
		Course c= null;
		
		for(Course course:list)
		{
			if(course.getId()==courseId)
			{
				c=course;
				break;
			}
		}
		return c;
	}


	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

}
