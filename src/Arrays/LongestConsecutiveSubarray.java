package Arrays;

import java.util.*;
public class LongestConsecutiveSubarray {
	public static void consecutiveSubarray(int arr[]) {
		int si =0, ei=0, start = 0, end = 0;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]+1 == arr[i+1]) {
				ei++;
			} else {
				if(ei-si > end-start) {
					start = si;
					end = ei;
				}
				si =i+1;
				ei = i+1;
			}
		}
		if(ei-si > end-start) {
			start = si;
			end = ei;
		}
		for(int i=start; i<=end; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		consecutiveSubarray(arr);
	}

}
