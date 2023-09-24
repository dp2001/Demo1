package com.example.curriculumdesign.service;

import java.util.List;
import java.util.Map;

public interface ResearchService {
    List<Object> Research(Integer Begin,Integer End);
    List<Map<Object,Object>> Segment(Integer Begin,Integer End,String cname);
}
