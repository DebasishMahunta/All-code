package Arrays;

import java.util.*;
public class Merge3SortedArray {
	public static int [] sortedArray(int arr1[], int arr2[], int arr3[]) {
		int i=0,l =0;
		int res[] = new int[arr1.length+arr2.length+arr3.length];
		while(l<res.length) {
			if(i<arr1.length) {
				res[l] = arr1[i];
				l++;
			}
			if(i<arr2.length) {
				res[l] = arr2[i];
				l++;
			}
			if(i<arr3.length) {
				res[l] = arr3[i];
				l++;
			}
			i++;
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
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		int o = sc.nextInt();
		int arr3[] = new int[o];
		for(int i=0; i<arr3.length; i++) {
			arr3[i] = sc.nextInt();
		}
		int result [] =sortedArray(arr1,arr2,arr3);
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i]+" ");
		}
	}

}
