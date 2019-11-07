package com.soma.step2;

public class WishImpl implements Greeting {

	@Override
	public void wish() {
		System.out.println("Hello World (by interface implemented class)");
	}

}
