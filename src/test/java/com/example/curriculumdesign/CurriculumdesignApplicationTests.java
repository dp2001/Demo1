package com.example.curriculumdesign;

import com.example.curriculumdesign.controller.PersonalScoreController;
import com.example.curriculumdesign.mapper.PersonalScoreMapper;
import com.example.curriculumdesign.mapper.ResearchMapper;
import com.example.curriculumdesign.mapper.StudyMapper;
import com.example.curriculumdesign.service.PersonalCourseService;
import com.example.curriculumdesign.service.ResearchService;
import com.example.curriculumdesign.service.impl.PersonalCourseServiceimpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.invoke.CallSite;
import java.util.*;

@SpringBootTest
class CurriculumdesignApplicationTests {
@Autowired
private ResearchMapper researchMapper;
    @Test
    void contextLoads() {
//        List<Object>  list =researchService.Research(1,2);
//        System.out.println(list);

//
    } 

    @Test
    void tset(){
        Map<Object, Object>my = researchMapper.count(null, null, "大学物理");
        System.out.println(my.size());
        List<Map<Object,Object>> list=new ArrayList<>();
      my.forEach((s,v)-> {System.out.println(s+" "+v);
          Map<Object,Object> map=new HashMap<>();
          map.put("value",v) ;
          map.put("name",s);
          list.add(map);});
        System.out.println(list);
    }
}
