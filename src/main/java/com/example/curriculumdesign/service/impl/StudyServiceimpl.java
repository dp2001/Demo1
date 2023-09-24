package com.example.curriculumdesign.service.impl;

import com.example.curriculumdesign.mapper.StudyMapper;
import com.example.curriculumdesign.pojo.PageBean;
import com.example.curriculumdesign.pojo.sc;
import com.example.curriculumdesign.service.StudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudyServiceimpl implements StudyService {
    @Autowired
    private StudyMapper studyMapper;



    @Override
    public PageBean page(Integer page, Integer pageSize, Integer sno, String cno, Integer max,Integer min) {
      return new PageBean(studyMapper.count(),studyMapper.list(sno,cno,max,min,(page-1)*pageSize,pageSize));
    }

    @Override
    public void delete(Integer son, String cno) {
         studyMapper.delete(son,cno);
    }

    @Override
    public void supdatetest(sc scourse) {
        studyMapper.update(scourse);
    }
}
