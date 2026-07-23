package com.sgic16.TASK.services;

import com.sgic16.TASK.dtos.SchoolDTO;
import com.sgic16.TASK.entities.School;

import java.util.List;

public interface SchoolService {
    School save(SchoolDTO schoolDTO);
    List<School>getAll();
    void delete(Long id);
    School update(Long id,SchoolDTO schoolDTO);
}
