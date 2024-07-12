package Arrays;

import java.util.*;
public class SmallestElementInAnArray {
	public static void smallestElement(int arr[]) {
		int min = Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		smallestElement(arr);
		
	}

}
