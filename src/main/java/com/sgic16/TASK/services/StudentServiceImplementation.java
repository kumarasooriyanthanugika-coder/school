package com.sgic16.TASK.services;



import com.sgic16.TASK.dtos.StudentDTO;
import com.sgic16.TASK.entities.School;
import com.sgic16.TASK.entities.Student;
import com.sgic16.TASK.repositories.SchoolRepository;
import com.sgic16.TASK.repositories.StudentRepository;
import com.sgic16.TASK.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImplementation implements StudentService {
    @Autowired
    private StudentRepository repository;
    @Autowired
    private SchoolRepository schoolRepository;

    @Override
    public Student save(StudentDTO studentDTO){

        Student student = new Student();

        student.setFirstName(studentDTO.getFirstName());
        student.setLastName(studentDTO.getLastName());
        student.setEmail(studentDTO.getEmail());
        student.setAge(studentDTO.getAge());

        School school=schoolRepository.findById(studentDTO.getSchoolId())
                .orElseThrow(()->new RuntimeException("School not Found"));

        student.setSchool(school);


        return repository.save(student);
    }

@Override
    public List<Student>getAll(){

        return repository.findAll();
}
@Override
    public void delete(Long id){
        repository.deleteById(id);
}
@Override
    public Student update(Long id,StudentDTO studentDTO){
        Student student=repository.findById(id)
                .orElseThrow(()->new RuntimeException("Student not Found"));

        student.setFirstName(studentDTO.getFirstName());
        student.setLastName(studentDTO.getLastName());
        student.setEmail(studentDTO.getEmail());
        student.setAge(studentDTO.getAge());

        School school=schoolRepository.findById(studentDTO.getSchoolId())
                .orElseThrow(()->new RuntimeException("School not Found"));

        student.setSchool(school);
        return repository.save(student);
}




}
