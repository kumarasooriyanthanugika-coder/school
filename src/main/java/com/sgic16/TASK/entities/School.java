package com.sgic16.TASK.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Generated;
import java.util.List;

import java.awt.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private  String schoolName;

    @OneToMany(mappedBy = "school",cascade = CascadeType.ALL)
    private List<Student> student;
}
