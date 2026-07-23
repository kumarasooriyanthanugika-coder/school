package com.sgic16.TASK.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentProfile {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private  String bio;

   @OneToOne
    @JoinColumn(name="Student_id")
    private Student student;
}
