package com.becky.designpattern.strategy;

public class MuteQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("《 Slience 》");
    }
}
