package com.pdy.annonation;

import com.pdy.enums.TypeEnum;

import java.lang.annotation.*;

/**
 * @author hongbinzhou
 * @version 1.0
 * @title: Check
 * @description: TODO
 * @date 2019/3/6
 */

@Target({ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Check {

    String message() ;
    TypeEnum rule() ;

}
