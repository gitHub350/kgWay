package com.pdy.utills;

import com.alibaba.fastjson.JSONObject;
import com.pdy.annonation.Check;


import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * @author hongbinzhou
 * @version 1.0
 * @title: CheckUtill
 * @description: TODO
 * @date 2019/3/6
 */
public class CheckUtill {





    public static boolean check (Class target,JSONObject json) {

        Field[] fields = target.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Check c = fields[i].getDeclaredAnnotation(Check.class);
            if (c != null) {
                String name = fields[i].getName();
                BiPredicate predicate = c.rule().getPredicate();
                boolean result = predicate.test(name,json);
                if (!result) {
                    return result;
                }
            }
        }
        return true;
    }
}
