package com.example.curriculumdesign.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface ResearchMapper {
    List<Map<String,Object>> AvgScore(Integer Begin,Integer End);
    Map<Object,Object>count(Integer Begin,Integer End,String cname);
}
