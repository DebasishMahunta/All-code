package Level0;

import java.util.*;

public class NumberEndsWithZeroOrNot {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n%10 == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
