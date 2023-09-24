package com.example.curriculumdesign.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class user {
private String   uid ;
private String   pm ;
private Integer role;
private String  name;
}
