package com.soma.step5.java7.interfaces;

import com.soma.step5.java7.entity.Person;

@FunctionalInterface
public interface Condition {
	boolean test(Person person);
}
