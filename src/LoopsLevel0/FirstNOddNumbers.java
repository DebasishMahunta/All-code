package LoopsLevel0;
import java.util.*;

public class FirstNOddNumbers {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i=1; i<n*2; i++) {
			if(i%2 == 1) {
				System.out.println(i);
			}
		}
	}

}
