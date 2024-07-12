package Arrays;

import java.util.*;
public class MissingNumber {
	public static int missingNumberArray(int arr[]) {
		int sum = 0;
		for(int i=0;i<arr.length; i++) {
			sum = sum+arr[i];
		}
		int n = arr.length+1;
		int sum2 = n*(n+1)/2;
		return sum2-sum;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(missingNumberArray(arr));
	}

}
