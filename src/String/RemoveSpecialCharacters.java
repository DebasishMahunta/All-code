package String;

import java.util.*;
public class RemoveSpecialCharacters {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		String r ="";
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9')) {
				r = r+s.charAt(i);
			}
		}
		System.out.println(r);
				
	}

}
