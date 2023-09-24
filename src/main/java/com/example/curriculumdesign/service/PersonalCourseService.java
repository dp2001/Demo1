package com.example.curriculumdesign.service;

import com.example.curriculumdesign.pojo.PageBean;

import java.util.List;

public interface PersonalCourseService {
    PageBean page(Integer sno);

    void update(Integer sno, List<Object> clist);
}
