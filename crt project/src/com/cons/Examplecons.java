package com.cons;

public class Examplecons {

	String name;
	int roll;

	public Examplecons(String name, int roll) {
		this.name = name;
		this.roll = roll;
	}

	public static void main(String[] args) {
		Examplecons cons = new Examplecons("Bhavy Soni", 101);
		System.out.println(cons.name + " " + cons.roll);

	}

}