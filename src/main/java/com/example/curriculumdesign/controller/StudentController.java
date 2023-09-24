package com.example.curriculumdesign.controller;

import com.example.curriculumdesign.pojo.PageBean;
import com.example.curriculumdesign.pojo.Result;
import com.example.curriculumdesign.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.curriculumdesign.pojo.s;

@Slf4j
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/student")
    @CrossOrigin
    public Result page(@RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "5")Integer pageSize,
                         String name,
                        Integer gender,
                       Integer maxsno,
                       Integer minsno
                        ){
        log.info("分页查询 {} {} {} {} {} {}",page,pageSize,name,gender,maxsno,minsno);
        PageBean pageBean= studentService.page(page,pageSize,name,gender,maxsno,minsno);
        return Result.success(pageBean);
    }

    @PostMapping("/student")
    @CrossOrigin
    public Result insert(@RequestBody s studnet ){
        log.info("新增学生student: {} ",studnet);
        studentService.insert(studnet);

        return Result.success();

    }

    @DeleteMapping("/student/id")
    @CrossOrigin
    public Result delete(Integer sno){
        log.info("删除sno为 {}",sno);
        studentService.delete(sno)  ;
        return Result.success();
    }

    @PutMapping("/student")
    @CrossOrigin
    public Result updatatest(@RequestBody s student){
        log.info("修改信息 {}",student);
        studentService.updatetest(student);
        return Result.success();
    }
}
