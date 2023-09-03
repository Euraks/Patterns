package my.patterns.strategy.model;

import my.patterns.strategy.interfeace.implfly.FlyNoWay;
import my.patterns.strategy.interfeace.implquack.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
}
