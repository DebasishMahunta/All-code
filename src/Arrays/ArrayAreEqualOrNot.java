package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAreEqualOrNot {
	
	public static void approach1(int arr1[], int arr2[]) {
		boolean status = Arrays.equals(arr1,arr2);
		if(status == true) {
			System.out.println("Arrays are equal");
		} else {
			System.out.println("Arrays are not equal");
		}
	}
	
	public static void approach2(int arr1[], int arr2[]) {
		boolean status = true;
		if(arr1.length == arr2.length) {
			for(int i=0; i<arr1.length; i++) {
				if(arr1[i]!=arr2[i]) {
					status = false;
				}
			}
		} else {
			status = false;
		}
		if(status == true) {
			System.out.println("Arrays are equals");
		} else {
			System.out.println("Arrays are not equals");
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr1[] = new int[n];
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		
		int m = sc.nextInt();
		int arr2[] = new int[m];
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		approach2(arr1,arr2);
	}

}
