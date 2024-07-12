package Arrays;

import java.util.Scanner;

public class DuplicteElementsInArray {
	public static void main(String args[]) {
		String arr[] = {"Java", "C", "C++", "Java", "Python"};
		boolean flage = false;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.println("Found duplicate elements: "+arr[i]);
					flage = true;
				}
			}
		}
		if(flage == false) {
			System.out.println("Not Found duplicate elements:");
		}
	}

}
