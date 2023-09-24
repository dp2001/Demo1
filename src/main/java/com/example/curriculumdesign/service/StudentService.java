package com.example.curriculumdesign.service;

import com.example.curriculumdesign.pojo.PageBean;
import com.example.curriculumdesign.pojo.s;
import java.time.LocalDateTime;

public interface StudentService {
    PageBean page(Integer page, Integer pageSize, String name, Integer gender, Integer maxsno,Integer minsno);

    void insert(s studnet);

    void delete(Integer sno);

    void updatetest(s student);
}
