package Level1;
import java.util.*;

public class AbsoluteValue {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int y;
		if (n < 0) {
		      y = -n;
		    } else {
		      y = n;
		    }
		System.out.println(y);
	}

}
