package Arrays;

import java.util.*;
public class OccuranceOfEachElement {
	public static void occuranceEachElement(int arr[]) {
		int count = 1;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] == arr[i+1]) {
				count++;
			} else {
				System.out.println(arr[i]+"-"+count);
				count=1;
			}
		}
		System.out.println(arr[arr.length-1]+"-"+count);
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		occuranceEachElement(arr);
	}

}
