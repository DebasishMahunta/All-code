package Arrays;

import java.util.Scanner;

public class AESNumber {
	
	static boolean isAesNumber(int n) {
		int count = 0;
		for(int i=1; i<=n; i++) {
			if(n%i == 0) {
				count++;
			}
		}
		if(count == 4) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
		int aes = 0;
		
		for(int i=l; i<r; i++) {
			if(isAesNumber(i) == true) {
				aes++;
			}
		}
		System.out.println(aes);
//		System.out.println(isAesNumber(n));
	}
}
