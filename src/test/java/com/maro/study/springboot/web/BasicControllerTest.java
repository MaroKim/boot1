package com.maro.study.springboot.web;

//import org.junit.Test;
//import org.junit.runner.RunWith;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = BasicController.class)
public class BasicControllerTest {

    @Autowired
    private MockMvc mvc;


    @Test
    public void helloReturnTest() throws Exception{
        String hello="hello";

        mvc.perform(get("/hello"))
            .andExpect(status().isOk())
            .andExpect(content().string(hello));

    }

    @Test
    public void helloDtoReturnTest() throws Exception {
        String name = "hello";
        int amount = 10000;

        mvc.perform(get("/hello/dto")
                .param("name",name)
                .param("amount",String.valueOf(amount)))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.name", is(name)))
                    .andExpect(jsonPath("$.amount", is(amount)));
    }
}
