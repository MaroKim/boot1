package com.maro.study.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;



//get method 생성
//모든 final 필드가 포함된 생성자를 생성해줌
@Getter
@RequiredArgsConstructor
public class BasicResponseDto {

    private final String name;
    private final int amount;
}
