package LoopsLevel0;
import java.util.*;

public class FirstnEvenNumbers {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i=1; i<=n*2; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
	}

}
