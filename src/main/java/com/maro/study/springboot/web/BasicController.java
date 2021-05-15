package com.maro.study.springboot.web;

import com.maro.study.springboot.web.dto.BasicResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//JSON 반환 컨트롤러
//메소드 전체가 @RespondeBody로 구성되어 있는 컨트롤러
@RestController
public class BasicController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello/dto")
    public BasicResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount){
        return new BasicResponseDto(name, amount);
    }


}
