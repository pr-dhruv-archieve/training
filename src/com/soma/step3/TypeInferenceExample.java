package com.soma.step3;

public class TypeInferenceExample {

	interface StringLembda {
		int getLength(String s);
	}
	
	public static void stringLength(StringLembda lembda) {
		System.out.println(lembda.getLength("hello lembda"));
	}
	
	public static void main(String[] args) {
		stringLength(s -> s.length());
		

	}

}
 