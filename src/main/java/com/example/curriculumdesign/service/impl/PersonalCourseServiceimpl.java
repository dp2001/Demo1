package com.example.curriculumdesign.service.impl;

import com.example.curriculumdesign.mapper.PersonalCourseMapper;
import com.example.curriculumdesign.pojo.PageBean;
import com.example.curriculumdesign.service.PersonalCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PersonalCourseServiceimpl implements PersonalCourseService {
    @Autowired
    private PersonalCourseMapper personalCourseMapper;



    @Override
    public PageBean page(Integer sno) {
        List<Map<String, Object>> list = personalCourseMapper.list(sno);
        return new PageBean((long) list.size(),list);
    }

    @Override
    public void update(Integer sno, List<Object> clist) {
        personalCourseMapper.update(clist,sno);
    }
}
