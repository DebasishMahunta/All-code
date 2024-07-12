package LoopsLevel0;
import java.util.*;

public class FirstNMultipleOf35And7TillN {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			int x = i*3;
			int y = i*5;
			int z = i*7;
			System.out.println(x+" "+y+" "+z);
		}
	}

}
