package com.liak.design.domain;

/**
 * @author leikai
 * @Date 2019/8/11 6:02 PM
 * @Description: 得分后卫 2
 **/
public class PointGuard extends Players {

    @Override
    public String getPlayer() {
        return getName()+"得分后卫";
    }
}
