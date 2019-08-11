package com.liak.design.domain;

/**
 * @author leikai
 * @Date 2019/8/11 5:57 PM
 * @Description: 球员
 **/
public class Players {

    private  String  name;

    public Players() {
    }

    public Players(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlayer(){
        return getName();
    }
}
