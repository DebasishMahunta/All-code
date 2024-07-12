package Pattern;
import java.util.*;
public class Pattern15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				if(j==0 || j==i || i==n-1) {
					System.out.print(j+1 + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
