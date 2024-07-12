package Level1;

import java.util.*;
public class UppercaseASCIIValueOrNot {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n>=65 && n<=90) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
