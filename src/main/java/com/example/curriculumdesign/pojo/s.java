package com.example.curriculumdesign.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class s {
    private Integer sno;
    private String name;
    private Integer age;
    private Integer gender;
    private String dept;
    private String speciality;

}
