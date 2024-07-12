package String;

import java.util.*;
public class NumberOfSpace {
	public static int countOfSpace(String s) {
		int count =0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == ' ') {
				count++;
			}
		}
		return count;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(countOfSpace(s));
	}

}
