package com.example.curriculumdesign.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import com.example.curriculumdesign.pojo.c;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public  interface CourseMapper {
    @Select("SELECT count(*) from c")
   public Long count();

    public List<c> list(String cno, String cname, String tname, Integer beginsize, Integer endsize);

    void insert(c course);
    @Delete("DELETE FROM c WHERE cno=#{cno}")
    void delete(String cno);

    void update(c course);
@Select("select sno from s")
    List <Integer>  sno();

    void insert1(String cno,List<Integer> list);
}
