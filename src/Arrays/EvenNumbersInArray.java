package Arrays;


import java.util.*;
public class EvenNumbersInArray {
	public static void evenNumberArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2 == 0) {
				System.out.print(arr[i]+" ");
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
		evenNumberArray(arr);
	}

}
