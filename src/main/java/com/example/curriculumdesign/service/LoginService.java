package com.example.curriculumdesign.service;
import com.example.curriculumdesign.pojo.user;
public interface LoginService {
    user checkpwd(String uid,String hm);
}
