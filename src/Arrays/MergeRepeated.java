package Arrays;

import java.util.*;
public class MergeRepeated {
	public static void sortedRepeatedArray(int arr1[], int arr2[]) {
		int i=0;
	    int j=0;
	    while(i<arr1.length && j<arr2.length) {
	    	if(arr1[i] == arr2[j]) {
	    		System.out.print(arr1[i]+" ");
	    		i++;
	    	} else if(arr1[i] <arr2[j]) {
	    		i++;
	    	} else {
	    		j++;
	    	}
	    }
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int arr1[] = new int[n];
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int arr2[] = new int[m];
		for(int j=0; j<arr2.length; j++) {
			arr2[j] = sc.nextInt();
		}
		sortedRepeatedArray(arr1,arr2);
	}

}
