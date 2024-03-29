package com.soma.step5.java7.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.soma.step5.java7.entity.Person;
import com.soma.step5.java7.interfaces.Condition;

public class Exercise {

	public static void main(String[] args) {

		/*
		 * Step 1 : sort list by last name
		 * 
		 * Step 2 : prints all the elements in the list
		 * 
		 * Step 3 : prints all elements from the list that have last name starts with G
		 */

		List<Person> peoples = Arrays.asList(new Person("Mahendra", "Prajapati", 25), new Person("Sonal", "Goyal", 23),
				new Person("Nivesh", "Prajapati", 21));

		// Step 1
		Collections.sort(peoples, new Comparator<Person>() {

			@Override
			public int compare(Person a, Person b) {
				return a.getLastName().compareTo(b.getLastName());
			}

		});

		// Step 2
		System.out.println("Printing all persons");
		System.out.println("============================================================");
		printAll(peoples);
		System.out.println("============================================================\n");

		// Step 3
		System.out.println("Person last name starts with P");
		System.out.println("============================================================");
		printLastNameBeginWith(peoples, "P");
		System.out.println("============================================================\n");

		System.out.println("Person last name starts with G (Using interfacee)");
		System.out.println("============================================================");
		printfConditionally(peoples, new Condition() {

			@Override
			public boolean test(Person person) {
				return person.getLastName().startsWith("G");
			}
		});
		System.out.println("============================================================\n");

		System.out.println("Person last name starts with P (using interface)");
		System.out.println("============================================================");
		printfConditionally(peoples, new Condition() {

			@Override
			public boolean test(Person person) {
				return person.getLastName().startsWith("P");
			}
		});
		System.out.println("============================================================\n");

	}

	private static void printfConditionally(List<Person> peoples, Condition condition) {
		for (Person person : peoples) {
			if (condition.test(person))
				System.out.println(person);
		}

	}

	private static void printLastNameBeginWith(List<Person> peoples, String startsWith) {
		for (Person person : peoples) {
			if (person.getLastName().startsWith(startsWith))
				System.out.println(person);
		}
	}

	private static void printAll(List<Person> peoples) {
		for (Person person : peoples) {
			System.out.println(person);
		}
	}

}
