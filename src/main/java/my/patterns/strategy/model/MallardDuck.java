package my.patterns.strategy.model;

import my.patterns.strategy.interfeace.implfly.FlyWithWings;
import my.patterns.strategy.interfeace.implquack.Quack;

public class MallardDuck extends Duck{
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
}
