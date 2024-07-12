package DataType;
import java.util.*;
public class CountDivisors {
	static int countDiv(int l,int r,int k) {
		int count = 0;
		for(int i=0; i<=r; i++) {
			if(i % k == 0) {
				count++;
			}
		}
		return count;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(countDiv(l,r,k));
	}

}
