package com.sgic16.TASK.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="first_name",length=100)
    private  String firstName;
    @Column(name="last_name",length=100)
    private  String lastName;
    @Column(unique=true)
    private String email;
    private Integer age;

    @ManyToOne
    @JoinColumn(name="School_id")
    private School school;

    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    private StudentProfile studentProfile;

    @ManyToMany
    @JoinTable(
            name="Student_course",
            joinColumns = @JoinColumn(name="Student_id"),
            inverseJoinColumns = @JoinColumn(name="Course_id")
    )
    private List<Course> course;
}
