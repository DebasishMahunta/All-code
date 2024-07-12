package String;

import java.util.*;
public class RemoveVowels {
	public static void printRemoveVowels(String s) {
	   String n ="";
	   for(int i=0; i<s.length(); i++) {
		   char ch = s.charAt(i);
		   if(ch == 'a'||ch == 'A'||ch == 'e'|| ch == 'E'|| ch== 'i' || ch== 'I' ||ch == 'o'||ch== 'O'||ch == 'u'|| ch == 'U' ) {
			   
		   } else {
			   n = n+ch;
		   }
	   }
	   System.out.println(n);
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		printRemoveVowels(s);
	}

}
