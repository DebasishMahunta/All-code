package Arrays;

import java.util.*;
public class PutAllThe0InEnd {
	public static void zeroInEnd(int arr[]) {
		int i=0;
		int j=0;
		while(i<arr.length) {
			if(arr[i] == 0) {
				i++;
			} else {
				arr[j] = arr[i];
				j++;
				i++;
			}
		}
		while(j<arr.length) {
			arr[j] = 0;
			j++;
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		zeroInEnd(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
