package com.enc;

public class testenc {

	private String name;
	private int roll;
	

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		testenc enc = new testenc();
		enc.setName("Bhavy");
		enc.setRoll(101);
		System.out.println(enc.getName()+" "+enc.getRoll());
	}

}