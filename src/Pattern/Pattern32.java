package Pattern;
import java.util.*;
public class Pattern32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char ch = 'A';
		for(int i=1; i<=n; i++) {
			if(i%2 == 0) {
				char chRev = (char)(ch +i -1);
				for(int j=1; j<=i; j++) {
					System.out.print(chRev-- +" ");
					ch++;
				}
			} else {
				for(int j=1; j<=i; j++) {
					System.out.print(ch++ +" ");
				}
			}
			System.out.println();
		}

	}

}
