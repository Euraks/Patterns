package my.patterns.strategy.interfeace.implfly;

import my.patterns.strategy.interfeace.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly no Way");
    }
}
