package LoopsLevel0;
import java.util.*;

public class FirstNMultipleOf2And3 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			if(i%2 == 0 || i%3 ==0) {
				System.out.println(i);
			}
		}
	}

}
