package com.soma.step1.lembdatest;

import com.soma.step1.lembdainterface.Lembda1;
import com.soma.step1.lembdainterface.Lembda2;

public class LembdaTest {
	public static void main(String[] args) {
		Lembda1 printing = () -> System.out.println("Hello World");
		Lembda2 adding = (int a, int b) -> a + b; 
	}
}