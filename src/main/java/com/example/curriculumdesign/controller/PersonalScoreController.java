package com.example.curriculumdesign.controller;

import com.example.curriculumdesign.pojo.PageBean;
import com.example.curriculumdesign.pojo.Result;
import com.example.curriculumdesign.service.PersonalScoreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@Slf4j
public class PersonalScoreController {
    @Autowired
    private PersonalScoreService personalScoreService;
   @GetMapping("/personalscore")
   @CrossOrigin
    public Result GetScorefrom(Integer sno){
       log.info("当前学号为：{}",sno);
       Map<String, Object> getscorefrom = personalScoreService.getscorefrom(sno);
       log.info("数据内容为{}",getscorefrom);
       return  Result.success(getscorefrom);
   }


    @GetMapping("/personalscore/sno")
    @CrossOrigin
    public Result page(@RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "5")Integer pageSize,
                      Integer sno
    ){
        log.info("分页查询 {} {} {} {} {} {}",page,pageSize,sno);
        PageBean pageBean= personalScoreService.page(page,pageSize,sno);
        return Result.success(pageBean);
    }

}
