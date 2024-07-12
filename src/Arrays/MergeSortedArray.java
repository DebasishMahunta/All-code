package Arrays;

import java.util.*;
public class MergeSortedArray {
	public static int []morge2SortedArray(int arr1[], int arr2[]) {
		int res[] = new int[arr1.length+arr2.length];
		int i=0,j=0,k=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i] < arr2[j]) {
				res[k] = arr1[i];
				k++;
				i++;

			} else {
				res[k] = arr2[j]; 
				k++;
				j++;
			}
		}
		while(i<arr1.length) {
			res[k] = arr1[i];
			k++;
			i++;
		}
		while(j<arr2.length) {
			res[k] = arr2[j];
			k++;
			j++;
		}
					
	   return res;
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
		for(int j=0; j<arr2.length; j++) {
			arr2[j] = sc.nextInt();
		}
		int result[] = morge2SortedArray(arr1,arr2);
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i]+" ");
		}
	}

}
