package com.example.curriculumdesign.mapper;

import com.example.curriculumdesign.pojo.sc;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Mapper
public interface StudyMapper {
@Select("select count(*) from sc")
    Long count();

    List<sc> list(Integer sno, String cno, Integer max,Integer min,Integer beginsize, Integer endsize);
@Delete("DELETE from sc where sno=#{sno} and cno=#{cno}")
    void delete(Integer sno, String cno);

    void update(sc scourse);

   List<Map<String,Objects>> test();
}
