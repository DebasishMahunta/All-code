package String;

import java.util.Arrays;
import java.util.Scanner;

public class GameOfThrones {
	public static String gameOfThrones(String s) {
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		
		int i = 0;
		int errorCount = 0;
		while(i<arr.length) {
			if(i<arr.length-1 && arr[i] == arr[i+1]) {
				i = i+2;
			} else {
				i++;
				errorCount++;
			}
		}
		if(errorCount <= 1) {
			return "Yes";
		} else {
			return "NO";
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(gameOfThrones(s));
	}
}
