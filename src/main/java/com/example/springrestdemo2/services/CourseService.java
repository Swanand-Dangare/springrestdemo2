package com.example.springrestdemo2.services;

import java.util.List;

import com.example.springrestdemo2.entity.Course;

public interface CourseService {
	public List<Course> getCourses();
	public Course getCourse(long courseId);
	public Course addCourse(Course course);
	public Course updateCourse(Course course);
	public void deleteCourse(long courseId);
	public Course getCourseByTitle(String title);

}
