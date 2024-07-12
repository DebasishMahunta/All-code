package String;

import java.util.*;
public class CountOfCharacter {
	public static int countOfChar(String s,String t) {
		int count = 0;
		char key = t.charAt(0);
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)== key) {
				count++;
			}
		}
		return count;
		
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		System.out.println(countOfChar(s,t));
	}

}
