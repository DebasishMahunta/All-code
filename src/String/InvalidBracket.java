package String;

import java.util.Scanner;

public class InvalidBracket {
	public static void invalidBracket(String s) {
		
		int bracket = 0, count = 0;
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c == '(') {
				bracket++;
			} else {
				if(bracket <= 0) {
					count++;
				}else {
					bracket--;
				}
			}
		}
		System.out.println(count+" "+bracket);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		invalidBracket(s);
	}
}
