package com.sgic16.TASK.controllers;

import com.sgic16.TASK.dtos.StudentDTO;
import com.sgic16.TASK.entities.Student;
import com.sgic16.TASK.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/Student")
public class StudentController {
    @Autowired
    private StudentService service;

    @GetMapping
    public List<Student>getAll(){
        return service.getAll();
    }

    @PostMapping
    public Student save(@RequestBody StudentDTO studentDTO){

        return service.save( studentDTO);
    }
   @DeleteMapping("/{id}")
    public String delete (@PathVariable Long id){
        service.delete(id);
        return "Student Deleted Successfully";
   }
   @PutMapping("/{id}")
    public Student update(@PathVariable Long id,@RequestBody StudentDTO studentDTO){
        return service.update(id, studentDTO);
   }


}
