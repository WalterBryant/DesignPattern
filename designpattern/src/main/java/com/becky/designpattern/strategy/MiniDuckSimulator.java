package com.becky.designpattern.strategy;

public class MiniDuckSimulator {

    public static void main(String args[]) {
        Duck mallard = new MallardDuck();

        //这会调用 MallardDuck 继承来的 performDuck() 方法，进而委托给该对象的 QuackBehavior 对象处理
        //（也就是说，调用继承来的 quackBehavior 引用对象的 quack()）.
        mallard.performQuack();

        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();


        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
