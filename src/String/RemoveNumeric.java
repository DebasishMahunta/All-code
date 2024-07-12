package String;

import java.util.*;
public class RemoveNumeric {
	public static void removeNumeric(String s, String r) {
		for(int i=0; i<s.length(); i++) {
			char ch =s.charAt(i);
			if(ch>='0' && ch<='9') {
			} else {
				r = r+ch;
			}
		}
		System.out.println(r);
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String r ="";
		removeNumeric(s,r);
	}

}
