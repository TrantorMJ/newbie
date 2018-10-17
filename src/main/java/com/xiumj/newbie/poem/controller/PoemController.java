package com.xiumj.newbie.poem.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author xiumj
 * create 2018-10-17 09:48
 * desc
 */
@Slf4j
@RestController
@RequestMapping(value = "/poem",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class PoemController {
    public String helloWorld(){
        return "Hello World !";
    }
}
