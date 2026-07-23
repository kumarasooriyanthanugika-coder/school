package com.sgic16.TASK.services;

import com.sgic16.TASK.dtos.StudentProfileDTO;
import com.sgic16.TASK.entities.StudentProfile;

import java.util.List;
public interface StudentProfileService {
    StudentProfile save(StudentProfileDTO studentProfileDTO);
    List<StudentProfile>getAll();
    void delete(Long id);
    StudentProfile update(Long id,StudentProfileDTO studentProfileDTO);
}
