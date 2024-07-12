package Arrays;

import java.util.Scanner;

public class Searching {
	
	static int linearSearch(int[]a, int key) {
		for(int i=0; i<a.length; i++) {
			if(a[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	static int binarySearch(int a[], int key) {
		int l = 0;
		int h = a.length-1;
		int mid = 0;
		while(l <= h) {
			mid = (l+h)/2;
			if(key == a[mid]) {
				return mid;
			} else if(key < a[mid]) {
				h = mid-1;
				
			} else {
				l = mid+1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int []a = new int[n];
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		int key = sc.nextInt();
		//System.out.println(linearSearch(a,key));
		System.out.println(binarySearch(a, key));
	}
}
