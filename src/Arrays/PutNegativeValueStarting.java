package Arrays;

import java.util.*;
public class PutNegativeValueStarting {
	public static void negativeValueArray(int arr[]) {
		int i = arr.length-1;
		int j = arr.length-1;
		while(i>=0) {
			if(arr[i] == -1) {
				i--;
			} else {
				arr[j] = arr[i];
				j--;
				i--;
			}
		}
		while(j>=0) {
			arr[j] = -1;
			j--;
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		 negativeValueArray(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
