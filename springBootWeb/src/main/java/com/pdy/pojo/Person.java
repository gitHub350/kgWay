package com.pdy.pojo;

import com.pdy.annonation.Check;
import com.pdy.enums.TypeEnum;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.function.Predicate;

/**
 * @author hongbinzhou
 * @version 1.0
 * @title: Person
 * @description: TODO
 * @date 2019/3/6
 */
public class Person extends BasePersoon{


    @NotEmpty(message = "不能为空")
    @Check(message = "age 不能为空值",rule = TypeEnum.NOT_EMPTY)
    private String name;



    private Integer age;

    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
