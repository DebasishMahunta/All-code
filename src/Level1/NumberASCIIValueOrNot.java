package Level1;

import java.util.*;

public class NumberASCIIValueOrNot {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n>=48 && n<=57) {
			System.out.println("yes");
		} else {
			System.out.println("No");
		}
	}

}
