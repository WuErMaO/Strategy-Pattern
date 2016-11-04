package behavior.impl.quack;

import behavior.QuackBehavior;

public class Squeak implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Squeak");
	}

}
