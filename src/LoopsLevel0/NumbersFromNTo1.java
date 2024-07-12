package LoopsLevel0;
import java.util.*;

public class NumbersFromNTo1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=n; i>0; i--) {
			System.out.print(i+" ");
		}
	}

}
