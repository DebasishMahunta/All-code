package Arrays;

import java.util.*;
public class CountOccuranceMoreThan1 {
	public static void occuranceMoreThan1(int arr[]) {
		int count = 1;
		int ct = 0;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] == arr[i+1]) {
				count++;
			} else {
				if(count>1) {
					ct++;
				}
				count = 1;
			}
		}
		System.out.println(ct);
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr [] = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		occuranceMoreThan1(arr);
	}

}
