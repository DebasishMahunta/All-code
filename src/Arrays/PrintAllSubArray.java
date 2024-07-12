package Arrays;

import java.util.*;
public class PrintAllSubArray {
	public static void subarray(int arr[]) {
		for(int k=1; k<=arr.length; k++) {
			for(int i=0; i<=arr.length-k; i++) {
				for(int j=i; j<k+i; j++) {
					System.out.print(arr[j]+" ");
				}
				System.out.println();
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
		subarray(arr);
	}

}
