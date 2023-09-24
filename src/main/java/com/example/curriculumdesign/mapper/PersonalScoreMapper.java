package com.example.curriculumdesign.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface PersonalScoreMapper {

   List<Map<String,Object>> list(Integer sno, Integer beginsize, Integer endsize);

    @Select("select count(grade) from sc where sno= #{sno}")
    Long count(Integer sno);

    Map<String,Object> getscorefrom(Integer sno);
}
