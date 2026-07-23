package com.sgic16.TASK.services;

import com.sgic16.TASK.dtos.StudentProfileDTO;
import com.sgic16.TASK.entities.Student;
import com.sgic16.TASK.entities.StudentProfile;
import com.sgic16.TASK.repositories.StudentProfileRepository;
import com.sgic16.TASK.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentProfileServiceImplementation implements StudentProfileService{

    @Autowired
    private StudentProfileRepository profileRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public StudentProfile save(StudentProfileDTO studentProfileDTO){
        Student student=studentRepository.findById(studentProfileDTO.getStudentId())
                .orElseThrow(()->new RuntimeException("Student not found"));

        StudentProfile profile=new StudentProfile();

        profile.setBio(studentProfileDTO.getBio());
        profile.setStudent(student);

        return profileRepository.save(profile);
    }
    @Override
    public void delete(Long id){
        profileRepository.deleteById(id);
    }
    @Override
    public List<StudentProfile>getAll(){

        return profileRepository.findAll();
    }
    @Override
    public StudentProfile update(Long id,StudentProfileDTO studentProfileDTO){
        StudentProfile profile=profileRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Student Profile not Found"));

        profile.setBio(studentProfileDTO.getBio());

        Student student=studentRepository.findById(studentProfileDTO.getStudentId())
                .orElseThrow(()->new RuntimeException("Student not Found"));

        profile.setStudent(student);
        return profileRepository.save(profile);
    }
}
