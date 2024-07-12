package String;

import java.util.*;
public class RemoveLowercase {
	public static String removeLowercase(String s,String r) {
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z') {
			} else {
				r = r+ch;
			}
		}
		return r;
	}
	public static void main(String aegs[]) {
		Scanner sc = new Scanner(System.in);
		String s =sc.nextLine();
		String r ="";
		System.out.println(removeLowercase(s,r));
	}

}
