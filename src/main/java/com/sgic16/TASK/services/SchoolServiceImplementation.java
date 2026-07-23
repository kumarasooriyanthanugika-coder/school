package com.sgic16.TASK.services;


import com.sgic16.TASK.dtos.SchoolDTO;
import com.sgic16.TASK.entities.School;
import com.sgic16.TASK.repositories.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolServiceImplementation implements SchoolService {
    @Autowired
    private SchoolRepository repository;

@Override
    public School save(SchoolDTO schoolDTO){
    School school=new School();
    school.setSchoolName(schoolDTO.getSchoolName());

    return  repository.save(school);
}

@Override
public void delete(Long id){
    repository.deleteById(id);
}
@Override
    public List<School>getAll(){

    return repository.findAll();
}
@Override
    public School update(Long id,SchoolDTO schoolDTO){
    School school=repository.findById(id)
            .orElseThrow(()->new RuntimeException("School not Found"));

    school.setSchoolName(schoolDTO.getSchoolName());
    return repository.save(school);
}
}
