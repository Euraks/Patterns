package my.patterns.strategy.model;

import my.patterns.strategy.interfeace.FlyBehavior;
import my.patterns.strategy.interfeace.QuackBehavior;

public class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public void preformFly(){
        flyBehavior.fly();
    }
    public void preformQuack(){
        quackBehavior.quack();
    }
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
}
