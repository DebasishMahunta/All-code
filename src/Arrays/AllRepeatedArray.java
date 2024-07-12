package Arrays;

import java.util.*;
public class AllRepeatedArray {
	public static void repeatedArray(int arr[]) {
		int count = 1;
		boolean isDuplicateExists = false;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] == arr[i+1]) {
				count++;
				if(count==2) {
					isDuplicateExists = true;
					System.out.println(arr[i]);
				}
			} else {
				count =1;
			}
		}
		
		if(!isDuplicateExists) {
			System.out.println("-1");
		}
		
	}
	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int arr [] = new int[n];
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
		int arr[] = {1,2,3,3,4,4,4,5};
		repeatedArray(arr);
	}

}
