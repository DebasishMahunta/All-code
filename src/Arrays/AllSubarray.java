package Arrays;

import java.util.*;
public class AllSubarray {
	public static void subarray(int arr[],int k) {
		for(int i=0; i<=arr.length-k; i++) {
			for(int j=i; j<k+i; j++) {
				System.out.print(arr[j]);
			}
			System.out.println();
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		subarray(arr,k);
	}

}
