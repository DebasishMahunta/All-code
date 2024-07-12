package String;

import java.util.*;
public class ConsonantsCount {
	public static void countConsonants(String s) {
		int count=0;
		for(int i=0; i<s.length(); i++) {
			char ch  = s.charAt(i);
			if((ch == 'a'||ch == 'A'||ch == 'e'|| ch == 'E'|| ch== 'i' || ch== 'I' ||ch == 'o'||ch== 'O'||ch == 'u'|| ch == 'U') || (ch==' ')) {
			} else {
				count++;
			}
		}
		System.out.println(count);
	}
	public static void main(String srgs[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		countConsonants(s);
	}

}
