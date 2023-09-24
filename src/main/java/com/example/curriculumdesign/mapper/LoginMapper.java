package com.example.curriculumdesign.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.example.curriculumdesign.pojo.user;
@Mapper
public interface LoginMapper {
    @Select("select * from user where uid=#{uid} and hm=#{hm}")
        user checkpwd(String uid,String hm);
  @Select("select name from s where sno=#{uid}")
   String findname(String uid);
}
