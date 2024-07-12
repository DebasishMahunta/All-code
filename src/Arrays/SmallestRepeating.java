package Arrays;

import java.util.*;
public class SmallestRepeating {
	public static int smallestRepeating(int arr[]) {
		for(int i=arr.length-1; i>0; i--) {
			if(arr[i] == arr[i-1]) {
				return arr[i];
			}
		}
		return -1; 
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(smallestRepeating(arr));
	}

}
