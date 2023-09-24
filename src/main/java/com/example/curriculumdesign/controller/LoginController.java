package com.example.curriculumdesign.controller;
import com.example.curriculumdesign.pojo.user;
import com.example.curriculumdesign.pojo.Result;
import com.example.curriculumdesign.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;
  @GetMapping("login")
    @CrossOrigin
    public Result login(String uid,String hm) {
      log.info("账号 {} 密码 {}",uid,hm);
      user checkpwd = loginService.checkpwd(uid,hm);
      if (checkpwd==null){
          return Result.error("404 NOT FOUND");
      }else {
          return Result.success(checkpwd);
      }
    }


}
