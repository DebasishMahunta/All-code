package DataType;

import java.util.Scanner;

public class TriangleGame {
	static void gameResult(int a,int b,int c) {
		if((a+b+c)==180) {
			if(a==60 && b==60 && c==60) {
				System.out.println("Prize 3");
			} else if(a==90 || b==90 || c==90) {
				System.out.println("Prize 2");
			} else {
				System.out.println("Prize 1");
			}
		} else {
			System.out.println("No Prize");
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		gameResult(a,b,c);
	}

}
