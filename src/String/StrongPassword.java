package String;

import java.util.Scanner;

public class StrongPassword {
	
	public static int strongPassword(int n, String s) {
			int digit = 1, lc = 1, uc = 1, sc = 1;
			for(int i=0; i<s.length(); i++) {
				char c = s.charAt(i);
				if(c >= '0' && c <= '9') {
					digit = 0;
				}else if(c >= 'a' && c <= 'z') {
					lc = 0;
				}else if(c >= 'A' && c <= 'Z') {
					uc = 0;
				}else {
					sc = 1;
				}
			}	
		if((digit+lc+uc+sc) > 6-n) {
			return (digit+lc+uc+sc);
		} else {
			return 6-n;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		System.out.println(strongPassword(n,s));
	}
}
