/**
 * 
 */
package com.corejava;

import java.util.Scanner;

/**
 * @author phishy
 *
 */
public class Variables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 5343;
		short num2 = 345;
		byte num3 = 34;
		float num4 = 23;
		double num5 = 34.00;
		char cname = 'c';
		boolean choice = false;
		String name;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter your name:");
		name = sc.nextLine();
		System.out.println("your name is "+name);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(cname);
		System.out.println(choice);
	}

}
