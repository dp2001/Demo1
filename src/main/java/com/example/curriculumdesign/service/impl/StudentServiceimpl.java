package com.example.curriculumdesign.service.impl;

import com.example.curriculumdesign.mapper.StudentMapper;
import com.example.curriculumdesign.pojo.PageBean;
import com.example.curriculumdesign.pojo.s;
import com.example.curriculumdesign.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public class StudentServiceimpl implements StudentService {
    @Autowired
  private   StudentMapper studentMapper;
    /*
        分页+查询
        总数
     */
    @Override
    public PageBean page(Integer page, Integer pageSize, String name, Integer gender, Integer maxsno, Integer minsno) {
        return new PageBean(studentMapper.count(),studentMapper.list1(name,gender,maxsno,minsno,(page-1)*pageSize,pageSize));
    }


   /*
        新增
     */

    @Override
    public void insert(s studnet) {
        studentMapper.insert(studnet);
    }
    /*
         按sno删除
      */
    @Override
    public void delete(Integer sno) {
        studentMapper.delete(sno);
    }
    /*
         更新数据
     */
    @Override
    public void updatetest(s student) {
        studentMapper.updatetest(student);
    }
}
