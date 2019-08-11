package com.liak.design.domain;

/**
 * @author leikai
 * @Date 2019/8/11 6:04 PM
 * @Description: 控球后卫 1
 **/
public class ControlGuard extends Players {
    @Override
    public String getPlayer() {
        return getName()+"控球后卫";
    }
}
