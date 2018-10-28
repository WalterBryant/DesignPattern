package com.becky.designpattern.strategy;

/**
 * 绿头鸭
 */
public class MallardDuck extends Duck {


    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();

    }

    @Override
    public void display() {
        System.out.println("I am a real Mallard duck");
    }


}
