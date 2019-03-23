package com.pdy.pojo;

import java.io.Serializable;

/**
 * @author hongbinzhou
 * @version 1.0
 * @title: BasePersoon
 * @description: TODO
 * @date 2019/3/6
 */
public class BasePersoon implements Serializable {
    protected String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
