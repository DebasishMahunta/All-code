package Arrays;

import java.util.Scanner;

public class DevuAndFriends {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d[] = new int[n];
		for(int i=0; i<d.length; i++) {
			d[i] = sc.nextInt();
		}
		
		int count = 0;
		for(int i=0; i<d.length; i++) {
			if(d[i] != d[i+1]) {
				count++;
			}
		}
	}
}
