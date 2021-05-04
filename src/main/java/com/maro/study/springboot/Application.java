package com.maro.study.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication = @Configuration + @EnableAutoConfiguration + @ComponentScan
//@Configuration : 생성한 Class를 Bean으로 생성시 싱글톤으로 한번만 생성
//@ComponentScan : @component, @Configuration 설정된 Class를 스캔해서 Bean으로 등록
//@EnableAutoConfiguration :Application Context를 만들 때 자동으로 설정하는 기능을 켬
//사용자가 필요할 것 같은 빈(bean)을 추측해서 ApplicationContext를 만들 때 필요한 설정을 한다.
//클래스패스(classpath)를 기준으로 설정을 한다
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        //내장 WAS 실행
        SpringApplication.run(Application.class, args);
    }
}
