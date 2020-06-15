package com.pdy.controller;

import com.pdy.pojo.Person;
import com.pdy.utills.JwtTokenUtil;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


/**
 * @Description:
 * @since: V1.0.0
 * @author: Vader
 * @date: 2020/6/15 15:58
 */
@RestController
@RequestMapping("/user")
public class LoginController {


    @Autowired
    private JwtTokenUtil tokenUtil;

    @RequestMapping("/login")
    public String sayHi(String mobile,String code) {

        Map<String,Object> claims = new HashMap<>(16);
        claims.put("code",code);
        claims.put("mobile",mobile);
        return tokenUtil.generateToken(mobile,claims);
    }

    @RequestMapping("/token")
    public String token(String token) {

        Claims claimFromToken = tokenUtil.getClaimFromToken(token);
        return claimFromToken.toString();
    }
}
