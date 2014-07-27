package com.javahonk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class FindShortestLength {

	public static void main(String[] args) {
		
		List<Person> list = addPerson();
		
		Collections.sort(list, new Person());

		for (Person person1 : list) {
			System.out.println("Friend Name: " + person1.getName()
					+ " Distance: " + person1.getDistance());
		}

	}

	static List<Person> addPerson() {
		
		List<Person> list = new ArrayList<Person>();
		Person person = new Person();
		person.setDistance(200);
		person.setName("A");
		list.add(person);

		person = new Person();
		person.setDistance(2000);
		person.setName("B");
		list.add(person);

		person = new Person();
		person.setDistance(100);
		person.setName("C");
		list.add(person);
		
		return list;		

	}

}

class Person implements Comparator<Person> {

	String name;
	int distance;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	@Override
	public int compare(Person o1, Person o2) {
		
		return o1.distance - o2.distance;
	}

}
