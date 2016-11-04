package duck;

import behavior.FlyBehavior;
import behavior.QuackBehavior;

public abstract class Duck {
	
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	public Duck(){
		
	}
	
	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void setFlyBehavior(FlyBehavior fb) {
		System.out.println("change flybehavior");
		flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		System.out.println("change quackbehavior");
		quackBehavior = qb;
	}
	
	public void swim() {
		System.out.println("All ducks float, even decoys");
	}
}
