package com.example.springrestdemo2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.springrestdemo2.entity.Course;

public interface CourseDao extends JpaRepository<Course, Long>{

	public Course getByTitle(String title);
//	public List<Course> getByIdGreaterThan(long id);
//	public List<Course> getByIdGreaterThanEqual(long id);
//	
	@Query("from Course where id>=?1 order by title desc")
	public List<Course> getbyIdSorted(long id);
	
}
