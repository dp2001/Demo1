package com.example.curriculumdesign.service.impl;

import com.example.curriculumdesign.mapper.PersonalScoreMapper;
import com.example.curriculumdesign.pojo.PageBean;
import com.example.curriculumdesign.service.PersonalScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PersonalScoreServiceimpl implements PersonalScoreService {
    @Autowired
     private PersonalScoreMapper personalScoreMapper;

    @Override
    public Map<String, Object> getscorefrom(Integer sno) {
        return personalScoreMapper.getscorefrom(sno);
    }

    @Override
    public PageBean page(Integer page, Integer pageSize, Integer sno) {
         return new PageBean(personalScoreMapper.count(sno), personalScoreMapper.list(sno,(page-1)*pageSize,pageSize));
    }
}
