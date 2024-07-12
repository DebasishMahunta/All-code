package Arrays;

import java.util.*;
public class OccuranceOfSmallestElement {
	public static void occuranceSmallest(int arr[]) {
		int min = Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		int key = min;
		int count=0;
		for(int i=0; i<arr.length;i++) {
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
		occuranceSmallest(arr);
	}

}
