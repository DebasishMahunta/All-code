package Arrays;

import java.util.*;
public class RightIn0sAnd1sInLeft {
	public static void put0sAnd1s(int arr[]){
		int i=0;
		int j = arr.length-1;
		while(i<j) {
			if(arr[i] == 1) {
				i++;
			} else if(arr[j] == 0) {
				j--;
			} else {
				arr[i] = 1;
				arr[j] = 0;
				i++;
				j--;
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
		put0sAnd1s(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
