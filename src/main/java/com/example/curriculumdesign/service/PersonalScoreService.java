package com.example.curriculumdesign.service;

import com.example.curriculumdesign.pojo.PageBean;

import java.util.Map;

public interface PersonalScoreService {
    Map<String,Object> getscorefrom(Integer sno);

    PageBean page(Integer page, Integer pageSize, Integer sno);
}
