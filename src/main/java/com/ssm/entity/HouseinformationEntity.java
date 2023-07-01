package com.ssm.entity;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

public class HouseinformationEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    public HouseinformationEntity(){

    }
    public HouseinformationEntity(T t){
        try {
            BeanUtils.copyProperties(this, t);
        } catch (IllegalAccessException | InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    /**
     *房屋id
     */
    private Long hid;
    /**
     * 
     */
}
