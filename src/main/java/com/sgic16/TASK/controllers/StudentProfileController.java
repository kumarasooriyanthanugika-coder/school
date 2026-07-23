package com.sgic16.TASK.controllers;

import com.sgic16.TASK.dtos.StudentProfileDTO;
import com.sgic16.TASK.entities.StudentProfile;
import com.sgic16.TASK.services.StudentProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/StudentProfile")
public class StudentProfileController {
    @Autowired
    private StudentProfileService service;

    //Save StudentProfile
    @PostMapping
    public StudentProfile save(@RequestBody StudentProfileDTO studentProfileDTO){
        return service.save(studentProfileDTO);
    }

    //Get All StudentProfile
    @GetMapping
    public List<StudentProfile>getAll(){

        return  service.getAll();
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
        service.delete(id);
        return "Student Profile Deleted Successfully";
    }

    @PutMapping("/{id}")
    public StudentProfile update(@PathVariable Long id,@RequestBody StudentProfileDTO studentProfileDTO){
        return service.update(id, studentProfileDTO);
    }

}
