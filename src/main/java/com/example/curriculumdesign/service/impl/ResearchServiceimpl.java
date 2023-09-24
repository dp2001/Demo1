package com.example.curriculumdesign.service.impl;

import com.example.curriculumdesign.mapper.ResearchMapper;
import com.example.curriculumdesign.service.ResearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.rmi.MarshalledObject;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ResearchServiceimpl implements ResearchService {
    @Autowired
    private ResearchMapper researchMapper;

    @Override
    public List<Object> Research(Integer Begin, Integer End) {
        List<Map<String, Object>> maps = researchMapper.AvgScore(Begin,End);
        List<String> list=new ArrayList<>();
        List<Object> list1=new ArrayList<>();
        List<Object> list0=new ArrayList<>();
        for (int i = 0; i < maps.size(); i++) {
            maps.get(i).forEach((key,value)->{
                System.out.println(value);
             if (value instanceof  String){
                 list.add((String) value);
             }else{
                 list1.add(value);
             }
            });
        }
        list0.add(list);
        list0.add(list1);

        return list0;
    }

    @Override
    public List<Map<Object, Object>> Segment(Integer Begin, Integer End, String cname) {
        Map<Object, Object> count = researchMapper.count(Begin, End, cname);
        List<Map<Object,Object>> list=new ArrayList<>();
        count.forEach((s,v)-> {System.out.println(s+" "+v);
            Map<Object,Object> map=new HashMap<>();
            map.put("value",v) ;
            map.put("name",s);
            list.add(map);});
        return  list;
    }
}
