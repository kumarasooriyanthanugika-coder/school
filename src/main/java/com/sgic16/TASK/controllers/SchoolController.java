package com.sgic16.TASK.controllers;

import com.sgic16.TASK.dtos.SchoolDTO;
import com.sgic16.TASK.entities.School;
import com.sgic16.TASK.services.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/School")
public class SchoolController {
    @Autowired
    private SchoolService service;

    @PostMapping
    public School save(@RequestBody SchoolDTO schoolDTO){

        return service.save(schoolDTO);
    }
    @GetMapping
    public List<School>getAll(){

        return service.getAll();
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
        service.delete(id);
        return "School Deleted Successfully";
    }

    @PutMapping("/{id}")
    public School update(@PathVariable Long id, @RequestBody SchoolDTO schoolDTO){
        return service.update(id, schoolDTO);
    }
}
