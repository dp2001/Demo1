package com.example.curriculumdesign.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface PersonalCourseMapper {
    List<Map<String, Object>> list(Integer sno) ;

    void update(List<Object> clist, Integer sno);


}
