package Arrays;

import java.util.*;
public class SumOfPairMaximumValue {
	public static int maximumValu(int arr[]) {
		int a = Integer.MIN_VALUE;
		int b = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>a) {
				b=a;
				a=arr[i];
			} else if(arr[i]>b) {
				b=arr[i];
			}
		}
		return a+b;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(maximumValu(arr));
	}

}
