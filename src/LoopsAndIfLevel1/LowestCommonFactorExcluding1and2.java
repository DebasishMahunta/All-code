package LoopsAndIfLevel1;
import java.util.*;

public class LowestCommonFactorExcluding1and2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		for(int i=3; i<=m; i++) {
			if(n%i == 0 && m%i == 0) {
				System.out.println(i);
				break;
			}
		}
	}

}
