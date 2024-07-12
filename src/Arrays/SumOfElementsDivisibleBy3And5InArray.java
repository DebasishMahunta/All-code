package Arrays;

import java.util.*;
public class SumOfElementsDivisibleBy3And5InArray {
	public static int sumOfElementDivisible(int arr[]) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%3 == 0 || arr[i]%5 == 0) {
				sum = sum+arr[i];
			}
		}
		return sum;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(sumOfElementDivisible(arr));
	}

}
