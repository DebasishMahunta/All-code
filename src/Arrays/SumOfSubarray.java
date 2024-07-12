package Arrays;

import java.util.*;
public class SumOfSubarray {
	public static void sumSubarray(int arr[], int l, int k) {
		for(int i=0; i<=arr.length-l; i++ ) {
			int sum = 0;
			for(int j=i; j<l+i ; j++){
				sum = sum+arr[j];
			}
			if(sum == k) {
				for(int j=i; j<l+i ; j++){
					System.out.print(arr[j]+" ");
				}
				System.out.println();
			}
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr [] = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int l = sc.nextInt();
		int k = sc.nextInt();
		sumSubarray(arr,l,k);
	}

}
