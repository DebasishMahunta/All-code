package String;

import java.util.Scanner;

public class MarsExploration {
	
	public static int marsExploration(String s) {
		int count = 0;
		for(int i=0; i<s.length(); i=i+3) {
			if(s.charAt(i) != 'S') {
				count++;
			}
			if(s.charAt(i+1) != 'O') {
				count++;
			}
			if(s.charAt(i+2) != 'S') {
				count++;
			}
		}
		return count;
	}	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(marsExploration(s));
	}
}
