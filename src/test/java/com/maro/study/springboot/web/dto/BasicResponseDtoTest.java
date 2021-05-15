package com.maro.study.springboot.web.dto;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BasicResponseDtoTest {

    @Test
    public void lombokTest(){
        String name = "test";
        int amount = 10000;

        BasicResponseDto dto = new BasicResponseDto(name, amount);

        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
