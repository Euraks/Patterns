package my.patterns.strategy.interfeace.implfly;

import my.patterns.strategy.interfeace.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Fly with Winds");
    }
}
