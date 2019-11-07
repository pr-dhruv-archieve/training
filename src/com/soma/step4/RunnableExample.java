package com.soma.step4;

public class RunnableExample {
	public static void main(String[] args) {
		Thread myThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Inside the thread.");
			}
			
		});
		
		myThread.start();
	
		
		Thread thread = new Thread(() -> System.out.println("Inside thread by lembda."));
		thread.start();
		
	}
}
