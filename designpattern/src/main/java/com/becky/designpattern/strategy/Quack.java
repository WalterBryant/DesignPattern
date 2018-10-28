package com.becky.designpattern.strategy;

/**
 * 真的呱呱叫
 */
public class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
