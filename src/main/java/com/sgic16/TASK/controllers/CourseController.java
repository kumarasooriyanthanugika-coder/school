package com.sgic16.TASK.controllers;

import com.sgic16.TASK.dtos.CourseDTO;
import com.sgic16.TASK.entities.Course;
import com.sgic16.TASK.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/Course")
public class CourseController {
    @Autowired
    private CourseService service;

    @GetMapping
    public List<Course>getAll(){
        return service.getAll();
    }

    @PostMapping
    public Course save(@RequestBody CourseDTO courseDTO){

        return service.save(courseDTO);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
        service.delete(id);
        return "Course Deleted Successfully";
    }

    @PutMapping("/{id}")
    public Course update(@PathVariable Long id,@RequestBody CourseDTO courseDTO){
        return service.update(id, courseDTO);
    }
}
