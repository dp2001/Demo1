package com.example.curriculumdesign.service;

import com.example.curriculumdesign.pojo.PageBean;
import com.example.curriculumdesign.pojo.c;

public interface CourseService {
    PageBean page(Integer page, Integer pageSize, String cno, String cname, String tname);

    void insert(c course);

    void delete(String cno);

    void updatetest(c course);

    void update(c course);
}
