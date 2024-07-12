package Arrays;

import java.util.*;
public class OddNumberInReverseInArray {
	public static void oddReverse(int arr[]) {
		for(int i=arr.length-1; i>=0; i--) {
			if(arr[i]%2 == 1) {
				System.out.print(arr[i]+" ");
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
		oddReverse(arr);
	}

}
