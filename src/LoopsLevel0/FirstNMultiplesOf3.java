package LoopsLevel0;
import java.util.*;

public class FirstNMultiplesOf3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			int mult = i*3;
			System.out.println(mult);
		}
	}

}
