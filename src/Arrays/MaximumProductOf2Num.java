package Arrays;

import java.util.*;
public class MaximumProductOf2Num {
	public static int maximumProduct(int arr[]) {
		int a = Integer.MIN_VALUE;
		int b = Integer.MIN_VALUE;
		int x = 0; 
		int y = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > a) {
				b = a;
				a = arr[i];
			} else if(arr[i]>b && arr[i] != a) {
				b=arr[i];
			}
			if(arr[i]<x) {
				y = x;
				x = arr[i];
			} else if(arr[i]<y) {
				y = arr[i];
			}
		}
		int p1 = a*b;
		int p2 = x*y;
		if(p1>p2) {
			return p1;
		} else {
			return p2;
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr [] = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(maximumProduct(arr));
	}
}
