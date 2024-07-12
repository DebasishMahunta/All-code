package LoopsLevel0;
import java.util.*;

public class FirstNMultiplesOf2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			int mult = i*2;
			System.out.println(mult);
		}
	}

}
