package Arrays;

import java.util.*;
public class BinarySearch {
	public static int indexofarray(int arr[],int key) {
		int start =0;
		int end = arr.length-1;
		while(start<=end) {
			int mid = (start+end)/2;
			if(arr[mid] == key) {
				return mid;
			}
			if(arr[mid]<key) {
				start = mid+1;
			} else {
				end = mid-1;
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
		int key = sc.nextInt();
		System.out.println(indexofarray(arr,key));
	}
}
