package Arrays;

import java.util.*;
public class SumSubarrayCount {
	public static void subarrayCount(int arr[] , int x, int k) {
		int count = 0;
		for(int i=0; i<=arr.length-x; i++) {
			int sum = 0;
			for(int j=i; j<x+i; j++) {
				sum = sum+arr[j];
			}
			if(sum == k) {
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
		int x = sc.nextInt();
		int k = sc.nextInt();
		subarrayCount(arr,x,k);
	}

}
