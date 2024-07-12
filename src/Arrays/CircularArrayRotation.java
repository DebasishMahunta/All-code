package Arrays;

import java.util.Scanner;

public class CircularArrayRotation {
	
	static int[] circularArrayRotation(int arr[], int k, int q[]) {
		int[] res = new int[q.length];
		int[] b = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			b[(i+k)%arr.length] = arr[i];
		}
		
		for(int i=0; i<q.length; i++) {
			res[i] = b[q[i]];
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int m = sc.nextInt();
		
		
		int arr[] = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int q[] = new int[m];
		for(int i=0; i<q.length; i++) {
			q[i] = sc.nextInt();
		}
		
		int[] res = circularArrayRotation(arr,k,q);
		for(int i=0; i<res.length; i++) {
			System.out.println(res[i]);
		}
		
	}
}
