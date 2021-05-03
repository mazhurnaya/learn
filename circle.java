package com.itbulls.mazhurna;

import java.util.Scanner;

public class circle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter circle radius: ");
		
		double r=sc.nextDouble();
				double c=2*Math.PI*r;

		System.out.println("Circle circumference is: " + c);
	}

}
