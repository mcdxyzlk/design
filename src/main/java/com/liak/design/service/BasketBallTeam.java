package com.liak.design.service;

import com.liak.design.domain.*;

/**
 * @author leikai
 * @Date 2019/8/11 6:27 PM
 * @Description: 篮球队
 **/
public class BasketBallTeam {

    public static Players createPlayer(String positions){
        Players player = new Players();
        switch (positions)
        {
            case "1":
                player = new ControlGuard();
                break;
            case  "2":
                player = new PointGuard();
                break;
            case "3":
                player = new SmallForward();
                break;
            case "4":
                player = new PowerForward();
                break;
            case "5":
                player = new CenterForward();
                break;


        }
        return  player;
    }
}
