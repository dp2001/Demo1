package com.example.curriculumdesign.mapper;

import com.example.curriculumdesign.service.StudentService;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import com.example.curriculumdesign.pojo.s;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface StudentMapper {
    public List<s> list1(String name, Integer gender, Integer maxsno
            , Integer minsno, Integer beginsize, Integer endsize);
    @Select("SELECT count(*) from s")
    public Long count();


    void insert(s studnet);
@Delete("DELETE FROM S WHERE sno=#{sno}")
    void delete(Integer sno);

    void updatetest(s student);
}
