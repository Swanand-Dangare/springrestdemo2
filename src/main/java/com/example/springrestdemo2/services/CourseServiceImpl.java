package com.example.springrestdemo2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springrestdemo2.dao.CourseDao;
import com.example.springrestdemo2.entity.Course;

@Service
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	private CourseDao courseDao;
	
	public CourseServiceImpl() {
		super();
	}

	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(long courseId) {
		Course entity = courseDao.findById(courseId).orElse(null);
		return entity;
	}
	
	@Override
	public Course getCourseByTitle(String title) {
		Course entity = courseDao.getByTitle(title);
		//System.out.println(courseDao.getByIdGreaterThan(145));
		//System.out.println(courseDao.getByIdGreaterThanEqual(145));
		//System.out.println(courseDao.getbyIdSorted(145));
		return entity;
	}

	@Override
	public Course addCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long courseId) {
		Course entity = courseDao.getReferenceById(courseId);
		courseDao.delete(entity);		
	}

}
