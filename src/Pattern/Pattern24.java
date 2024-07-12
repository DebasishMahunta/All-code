package Pattern;
import java.util.*;
public class Pattern24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			if(i%2 == 0) {
				System.out.print(i+1);
			}
			for(int j=1; j<=n; j++) {
				System.out.print(i);
			}
			if(i%2 != 0) {
				System.out.print(i+1);
			}
			System.out.println();
		}

	}

}
