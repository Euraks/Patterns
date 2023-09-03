package my.patterns.strategy.interfeace.implquack;

import my.patterns.strategy.interfeace.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
