package Arrays;

import java.util.*;
public class ElementsDivisibleBy2And3InArray {
	public static void elementDivisible(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2 == 0 || arr[i]%3 == 0) {
				System.out.println(arr[i]);
			}
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr []= new int [n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		elementDivisible(arr);
	}

}
