package Basics;
import java.util.*;

public class ConvertDollarsToRupees {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		double dollars = sc.nextDouble();
		double rup = 82.83;
		
		double rupees = rup*dollars;
		System.out.println(rupees);
	}

}
