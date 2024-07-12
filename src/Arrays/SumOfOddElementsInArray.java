package Arrays;

import java.util.*;
public class SumOfOddElementsInArray {
	public static int sumOfOddNumberInArray(int arr[]) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2 != 0) {
				sum = sum+arr[i];
			}
		}
		return sum;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr [] = new int [n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(sumOfOddNumberInArray(arr));
	}

}
