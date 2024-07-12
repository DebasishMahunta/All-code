package Arrays;

import java.util.*;
public class OccuranceOfLargestElement {
	public static void occuranceLargest(int arr[]) {
		int max = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		int key = max;
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == key) {
				count++;
			}
		}
		System.out.println(count);
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		occuranceLargest(arr);
	}

}
