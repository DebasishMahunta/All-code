package Arrays;

import java.util.*;
public class IndexOfArray {
	public static void indexArray(int arr[], int key) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == key) {
				System.out.println(i);
			}
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int key = sc.nextInt();
		indexArray(arr,key);
	}

}
