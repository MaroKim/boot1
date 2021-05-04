package com.maro.study.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//JSON 반환 컨트롤러
//메소드 전체가 @RespondeBody로 구성되어 있는 컨트롤러
@RestController
public class BasicController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
