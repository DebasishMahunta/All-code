package String;

import java.util.*;
public class RemoveUppercase {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String r ="";
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch>='A' && ch<='Z') {
			} else {
				r = r+ch;
			}
		}
		System.out.println(r);
	}

}
