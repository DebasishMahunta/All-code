package Arrays;

import java.util.*;
public class UniqueElement {
	public static void countUniqueElement(int arr[]) {
		int count =1;
		int ucount=0;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] == arr[i+1]) {
				count++;
			} else {
				if(count == 1) {
					ucount++;
				}
				count = 1;
			}
		}
		if(count == 1) {
			ucount++;
			System.out.println(ucount);
		}
	}
	public static void main(String srgs[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		countUniqueElement(arr);
	}

}
