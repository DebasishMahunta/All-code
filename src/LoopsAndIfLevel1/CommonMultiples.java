package LoopsAndIfLevel1;
import java.util.*;

public class CommonMultiples {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count = 0;
        int i = 1;
        while (count < n) {
            if (i % a == 0 && i % b == 0) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
	}

}
