package com.adrian.demo.controller;

import com.adrian.demo.Test;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;

@RestController
public class TestController {



    @RequestMapping("/normal")
    public String normalTest(){

        Test test = new Test();
        test.setName("whr44432243242345");
        Class clazz = Test.class;
        String result = null;
        try {
            Method method = clazz.getDeclaredMethod("getName");
            result = (String) method.invoke(test.getClass().newInstance(),null);
            System.out.println(test.getName()+"");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}

