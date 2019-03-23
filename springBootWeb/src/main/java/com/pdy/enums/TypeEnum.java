package com.pdy.enums;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * @author hongbinzhou
 * @version 1.0
 * @title: TypeEnum
 * @description: TODO
 * @date 2019/3/6
 */
public enum TypeEnum {


    NOT_EMPTY((str,json) -> {
        JSONObject ajson = (JSONObject) json;
        String o = (String)ajson.get(str);
        return StringUtils.isNotEmpty(o);
    });

    private BiPredicate predicate;

    TypeEnum(BiPredicate predicate) {
        this.predicate = predicate;
    }


    public BiPredicate getPredicate() {
        return predicate;
    }


}
