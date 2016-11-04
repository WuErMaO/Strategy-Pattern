package behavior.impl.quack;

import behavior.QuackBehavior;

public class Quack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Quack");
	}

}
