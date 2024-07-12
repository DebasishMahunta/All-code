package Pattern;
import java.util.*;

public class Pattern2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count;
		for(int i=0; i<n; i++) {
			count = i+1;
			for(int j=0; j<n; j++) {
				System.out.print(count++ +" ");
			}
			System.out.println();
		}
	}

}
