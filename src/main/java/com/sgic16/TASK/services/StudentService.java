package com.sgic16.TASK.services;



import com.sgic16.TASK.dtos.StudentDTO;
import com.sgic16.TASK.entities.Student;

import java.util.List;

public interface StudentService {
    Student save(StudentDTO studentDTO);
    List<Student> getAll();

    void delete(Long id);
    Student update(Long id,StudentDTO studentDTO);

}
