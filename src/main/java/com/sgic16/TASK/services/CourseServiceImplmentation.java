package com.sgic16.TASK.services;

import com.sgic16.TASK.dtos.CourseDTO;
import com.sgic16.TASK.entities.Course;
import com.sgic16.TASK.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
public class CourseServiceImplmentation implements CourseService {

    @Autowired
    private CourseRepository repository;

    @Override
    public Course save(CourseDTO courseDTO){
        Course course=new Course();

        course.setCourseName(courseDTO.getCourseName());
        return  repository .save(course);
    }
    @Override
    public void delete(Long id){
        repository.deleteById(id);
    }

    @Override
    public List<Course>getAll(){
        return repository.findAll();
    }
    @Override
public Course update(@PathVariable Long id,CourseDTO courseDTO){
            Course course=repository.findById(id)
                    .orElseThrow(()->new RuntimeException("Course not Found"));

            course.setCourseName(courseDTO.getCourseName());
            return repository.save(course);
    }
}
