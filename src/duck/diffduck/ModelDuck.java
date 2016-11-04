package duck.diffduck;

import behavior.impl.fly.FlyNoWay;
import behavior.impl.quack.Quack;
import duck.Duck;

public class ModelDuck extends Duck{
	
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I'm a model duck");
	}

}
