package com.soma.step2;

public class Demo {

	public void greeter(Greeting greeting) {
		greeting.wish();
	}

	public static void main(String[] args) {
		Demo demo = new Demo();

		// Using Interface implementation
		Greeting wishImpl = new WishImpl();

		// Using Lembda Expression
		Greeting lembda = () -> System.out.println("Hello World (by lembda expression)");

		// Using anonymous class
		Greeting anonymous = new Greeting() {

			@Override
			public void wish() {
				System.out.println("Hello World (by anonymous class)");
			}
		};

		// Testing
		wishImpl.wish();
		lembda.wish();

		demo.greeter(wishImpl);
		demo.greeter(anonymous);
		
		demo.greeter(() -> System.out.println("Hello World (by lembda expression)"));
	}
}
