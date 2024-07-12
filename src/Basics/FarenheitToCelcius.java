package Basics;

import java.util.*;

public class FarenheitToCelcius {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		float f = sc.nextFloat();
		
		float celcius =  ((f-32)*5)/9;
		System.out.println(celcius);
	}

}
