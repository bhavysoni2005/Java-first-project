package com.eception;

public class Example2 {

	public static void main(String[] args) {
		try {
			int a[] = {1,2,3,4};
			System.out.println(a[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Code Always execute");
		}

	}

}