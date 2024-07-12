package String;

import java.util.Scanner;

public class CamelCase {
	
	public static int camelCase(String s) {
		int count = 1;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(camelCase(s));
	}
}
