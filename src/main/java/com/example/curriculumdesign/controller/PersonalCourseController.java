package com.example.curriculumdesign.controller;

import com.example.curriculumdesign.pojo.PageBean;
import com.example.curriculumdesign.pojo.Result;
import com.example.curriculumdesign.service.PersonalCourseService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
public class PersonalCourseController {

       @Autowired
    private PersonalCourseService personalCourseService;

    @GetMapping("/personalcourse")
    @CrossOrigin
    public Result page(Integer sno){
        log.info("分页查询 {} {} {} {} {} {}",sno);
        PageBean pageBean= personalCourseService.page(sno);
        return Result.success(pageBean);
    }

    @PostMapping("/personalcourse/sno")
    @CrossOrigin
    public  Result update(@RequestBody  List<Object> data1){
        log.info("{}选课",data1);
        String s=null;
        List<Object> clist=new ArrayList<>();
        for (int i = 0; i < data1.size(); i++) {
            if (data1.get(i) instanceof List<?>){
                clist= (List<Object>) data1.get(i);
            }else {
                s= (String) data1.get(i);
            }
        }
        Integer sno = Integer.valueOf(s);
        System.out.println(clist);
        System.out.println(sno);
         personalCourseService.update(sno,clist);
        return Result.success();
    }
}
