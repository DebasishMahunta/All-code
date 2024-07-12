package Arrays;

import java.util.*;
public class OccuranceMost {
	public static void occuranceMost(int arr[]) {
		int count = 1;
		int max =0;
		int maxNum=0;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] == arr[i+1]) {
				count++;
			} else {
				if(count > max) {
					max = count;
					maxNum = arr[i];
				}
				count = 1;
			}
		}
		if(count > max) {
			max = count;
			maxNum = arr[arr.length-1];
		}
		System.out.println(maxNum+"- "+max);
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr [] = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		occuranceMost(arr);
	}

}
