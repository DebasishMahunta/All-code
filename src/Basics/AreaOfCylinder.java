package Basics;
import java.util.*;

public class AreaOfCylinder {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		int h = sc.nextInt();
		double pi =3.142;
		double ar = 2 * pi* r*(r+h);
		System.out.println(ar);
		
	}

}
