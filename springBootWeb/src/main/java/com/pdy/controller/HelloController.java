package com.pdy.controller;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPObject;
import com.pdy.annonation.Check;
import com.pdy.enums.TypeEnum;
import com.pdy.pojo.Person;
import com.pdy.utills.CheckUtill;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.lang.reflect.Field;


/**
 * 修改说明
 */
@RestController
@RequestMapping("/hello")
public class HelloController {


    @RequestMapping("/hi")
    public String sayHi(@RequestBody @Valid Person person, BindingResult result) {


        if(result.hasErrors()) {

            for (ObjectError error : result.getAllErrors()) {
                System.out.println(error.getDefaultMessage());
            }

        }


        return "ok";
    }


    @RequestMapping("/hello")
    public String sayHello(@RequestBody  Person person, BindingResult result) {

       // String s = JSONObject.toJSONString(person);
        JSONObject jsonObject = (JSONObject)JSONObject.toJSON(person);
        CheckUtill.check(Person.class,jsonObject);


       // System.out.println(s);
        System.out.println(jsonObject.toString());


        return "ok";
    }


}
