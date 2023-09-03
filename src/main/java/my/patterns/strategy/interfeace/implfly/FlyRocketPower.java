package my.patterns.strategy.interfeace.implfly;

import my.patterns.strategy.interfeace.FlyBehavior;

public class FlyRocketPower implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println(" I`am rocket Duck");
    }
}
