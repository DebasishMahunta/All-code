package LoopsAndIfLevel1;
import java.util.*;

public class SumofnNaturalNumbers {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int res=0;
//		for(int i=0; i<=n; i++) {
//			 res = res+i;
//		}
//		System.out.println(res);
		int x=n*(n+1)/2;
		System.out.println(x);
	}

}
