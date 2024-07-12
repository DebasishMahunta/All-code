package Arrays;

import java.util.*;
public class SumEqualsPairs {
	public static void kEqualsToPairs(int arr[], int k) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]+arr[j] == k) {
					System.out.println(arr[i]+" "+arr[j]);
				}
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
		int k = sc.nextInt();
		kEqualsToPairs(arr,k);
	}

}
