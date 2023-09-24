package com.example.curriculumdesign.controller;

import com.example.curriculumdesign.pojo.Result;
import com.example.curriculumdesign.service.ResearchService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@Slf4j
public class ResearchController {
    @Autowired
    private ResearchService researchService;
    @GetMapping("/research")
    @CrossOrigin
    public Result Research(Integer Begin ,Integer End){
        List<Object> research = researchService.Research(Begin, End);
           log.info("{}   {}",Begin,End);
        return Result.success(research);
    }

    @GetMapping("/research/cname")
    @CrossOrigin
    public  Result Fractionalsegment(Integer Begin,Integer End,String cname){
        List<Map<Object, Object>> segment = researchService.Segment(Begin, End, cname);
        log.info("{ }",segment);
        return Result.success(segment);
    }


}
