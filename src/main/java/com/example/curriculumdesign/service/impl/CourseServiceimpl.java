package com.example.curriculumdesign.service.impl;

import com.example.curriculumdesign.mapper.CourseMapper;
import com.example.curriculumdesign.pojo.PageBean;
import com.example.curriculumdesign.pojo.c;
import com.example.curriculumdesign.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceimpl  implements CourseService {

    @Autowired
    private CourseMapper courseMapper;
    /*
        分页+查询
     */
    @Override
    public PageBean page(Integer page, Integer pageSize, String cno, String cname, String tname) {
        return new PageBean(courseMapper.count(), courseMapper.list(cno,cname,tname,(page-1)*pageSize,pageSize));
    }
    /*
        新增课程
     */
    @Override
    public void insert(c course) {
              courseMapper.insert(course);
    }

    /*
      cno删除
     */
    @Override
    public void delete(String cno) {
        courseMapper.delete(cno);

    }
  /*
   跟新数据
   */
    @Override
    public void updatetest(c course) {
      courseMapper.update(course);
    }

    @Override
    public void update(c course) {
        List<Integer> list = courseMapper.sno();
        String cno=course.getCno();
        courseMapper.insert1(cno,list);
    }
}
