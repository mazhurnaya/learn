package com.itbulls.mazhurna;
import java.util.Scanner;  

public class area {    

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		System.out.print("Please, enter A side of a triangle: ");
		double sideA = sc.nextDouble();
		System.out.print("Please, enter B side of a triangle: ");
		double sideB = sc.nextDouble();
		
		System.out.print("Please, enter C side of a triangle: ");
		double sideC = sc.nextDouble();
		
		double p= (sideA+sideB+sideC)/2;
		double TriangleArea=Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
		
		System.out.println(TriangleArea);

		System.out.print("Please, enter matrix size: ");
		int size = in.nextInt();
		double[][] matrix = generateMatrix(size);

		System.out.println("How you want to rotate matrix:" + System.lineSeparator() +
				"\t1 - 90" + System.lineSeparator() +
				"\t2 - 180" + System.lineSeparator() +
				"\t3 - 270");
		int mode = in.nextInt();

		System.out.println(System.lineSeparator() + "Base matrix:" + System.lineSeparator());
		printMatrixToConsole(matrix);
		System.out.println();
	}

}
