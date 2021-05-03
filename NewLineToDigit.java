package com.itbulls.mazhurna;
import java.util.Scanner;
public class NewLineToDigit {
	public static void main(String[] args) {
		System.out.print("Please, enter any integer: ");
		Scanner sc = new Scanner(System.in);
		String intString = sc.next();
		for (char number: intString.toCharArray()) {
			System.out.println(number);
		}
	}
}
