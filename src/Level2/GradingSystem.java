package Level2;
import java.util.*;

public class GradingSystem {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n<=100 && n>90) {
			System.out.println("A+");
		} else if(n<90 && n>80) {
			System.out.println("A");
		} else if(n<80 && n>70) {
			System.out.println("B+");
		} else if(n<70 && n>60) {
			System.out.println("B");
		} else if(n<60 && n>50) {
			System.out.println("C+");
		} else if(n<50 && n>40) {
			System.out.println("C");
		} else if(n<40 && n>10) {
			System.out.println("FAIL");
		} else 
			System.out.println("Invalid");
		}
	}

