package Level2;
import java.util.*;

public class Swap2Numbers {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c;
		c = a;
		a = b;
		b = c;
		System.out.println(a);
		System.out.println(b);
	}

}
