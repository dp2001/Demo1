package com.example.curriculumdesign.service;
import com.example.curriculumdesign.pojo.PageBean;
import com.example.curriculumdesign.pojo.sc;
public interface StudyService {



    PageBean page(Integer page, Integer pageSize, Integer sno, String cno, Integer max,Integer min);

    void delete(Integer sno, String cno);

    void supdatetest(sc scourse);
}
