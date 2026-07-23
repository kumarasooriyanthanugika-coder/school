package com.sgic16.TASK.services;

import com.sgic16.TASK.dtos.CourseDTO;
import com.sgic16.TASK.entities.Course;

import java.util.List;
public interface CourseService {
    Course save(CourseDTO courseDTO);
    List<Course>getAll();
    void delete(Long id);
    Course update(Long id,CourseDTO courseDTO);
}
