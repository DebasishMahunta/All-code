package Basics;

import java.util.*;

public class CelsiusToFahrenheit {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		 
		double c = sc.nextDouble();
		
		double fahrenheit = ((c*9)/5)+32;
		System.out.println(fahrenheit);
	}

}
