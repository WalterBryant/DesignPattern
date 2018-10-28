package com.becky.designpattern.strategy;

public abstract class Duck {

    FlyBehavior flyBehavior;//为行为接口类型声明两个引用变量，所有个鸭子子类都继承它们
    QuackBehavior quackBehavior;

    public Duck() {

    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();//委托给行为类
    }

    public void performQuack() {
        quackBehavior.quack();//委托给行为类
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }


    //在运行时想改变鸭子的行为，只需调用鸭子的 setter 方法
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
