package Arrays;

import java.util.Scanner;

public class Sorting {
	
	static void babbleSort(int arr[]) {
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	static void insertionSort(int arr[]) {
		for(int i=1; i<arr.length; i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}
	
	static void selectionSort(int arr[]) {
		for(int i=0; i<arr.length-1; i++) {
			int min_i = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] < arr[min_i]) {
					min_i = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min_i];
			arr[min_i] = temp;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int []arr = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
//		babbleSort(arr);
//		insertionSort(arr);
		selectionSort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
