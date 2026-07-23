package com.sgic16.TASK.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class StudentDTO {

    private String firstName;
    private  String lastName;
    private String email;
    private Integer age;

    private Long schoolId;

}
