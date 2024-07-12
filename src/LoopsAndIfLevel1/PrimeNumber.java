package LoopsAndIfLevel1;
import java.util.*;

public class PrimeNumber {
	public static String isPrime(int n) {
		if(n==2) {
			return "Yes";
		}
		for(int i=2;i<=Math.sqrt(n); i++) {
			if(n%2 == 0) {
				return "No";
			}
		}
		return "Yes";
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isPrime(n));
	}
}
