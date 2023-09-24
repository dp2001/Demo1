package com.example.curriculumdesign.controller;

import com.example.curriculumdesign.pojo.PageBean;
import com.example.curriculumdesign.pojo.Result;

import com.example.curriculumdesign.pojo.c;
import com.example.curriculumdesign.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@Slf4j
@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/course")
    @CrossOrigin
    public Result page(@RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "5") Integer pageSize,
                       String cno, String cname,
                       String tname
    ) {
        System.out.println(cno+"--- "+cname+"=--"+tname);
        log.info("分页查询 {} {} {} {} {} {}", page, pageSize, cno,cname,tname);
        PageBean pageBean = courseService.page(page, pageSize, cno,cname,tname);
        System.out.println(pageBean.getRows());
        return Result.success(pageBean);
    }

    @PostMapping("/course")
    @CrossOrigin
    public Result insert(@RequestBody c course) {
        log.info("新增专业: {} ", course);
         courseService.insert(course);
         courseService.update(course);
        return Result.success();

    }

    @DeleteMapping("/course/id")
    @CrossOrigin
    public Result delete(String cno) {
        log.info("删除sno为 {}", cno);
        courseService.delete(cno);
        return Result.success();
    }

    @PutMapping("/course")
    @CrossOrigin
    public Result updatatest(@RequestBody c course) {
        log.info("修改信息 {}", course);
        courseService.updatetest(course);
        return Result.success();
    }
}
