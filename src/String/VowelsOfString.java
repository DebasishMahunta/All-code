package String;

import java.util.*;
public class VowelsOfString {
	public static void countOfVowels(String s) {
		int count=0;
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch == 'a'||ch == 'A'||ch == 'e'|| ch == 'E'|| ch== 'i' || ch== 'I' ||ch == 'o'||ch== 'O'||ch == 'u'|| ch == 'U' ) {
				count++;
			}
		}
		System.out.println(count);
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		countOfVowels(s);
	}

}
