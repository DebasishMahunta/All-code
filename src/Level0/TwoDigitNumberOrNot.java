package Level0;

import java.util.*;

public class TwoDigitNumberOrNot {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n>=10 && n<=99) 
		{
			System.out.println("Yes");
		}
		else 
		{
			System.out.println("No");
		}
	}

}
