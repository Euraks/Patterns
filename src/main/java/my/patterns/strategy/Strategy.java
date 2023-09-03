package my.patterns.strategy;

import my.patterns.strategy.interfeace.implfly.FlyRocketPower;
import my.patterns.strategy.model.MallardDuck;
import my.patterns.strategy.model.ModelDuck;

public class Strategy {

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.preformFly();
        mallardDuck.preformQuack();

        ModelDuck modelDuck = new ModelDuck();
        modelDuck.preformFly();
        modelDuck.preformQuack();

        modelDuck.setFlyBehavior( new FlyRocketPower() );

        modelDuck.preformFly();
        modelDuck.preformQuack();


    }
}
