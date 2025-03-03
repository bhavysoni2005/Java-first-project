package com.sc;

import java.util.Scanner;

public class imputScan {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter your name:");
	        System.out.println("Enter your roll number:");
	        
	        String name=sc.nextLine();
	        int roll =sc.nextInt();
	        System.out.println(" your  roll no. is :"+ roll);
	        System.out.println("your name is:" +name);
	        

}
}