package com.sgic16.TASK.repositories;

import com.sgic16.TASK.entities.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, Long> {
}
