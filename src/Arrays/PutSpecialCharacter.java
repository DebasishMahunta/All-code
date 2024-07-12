/* WAP to print *,#,$ between every number as given in the below situation.
 *  I/P - 7 3 2 4 9 5; O/P - 7*3$2#4$9*5 ; 
 */

package Arrays;

import java.util.*;
public class PutSpecialCharacter {
	public static void specialCharacter(int arr[]) {
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]%2 != 0 && arr[i+1]%2 != 0) {
				System.out.print(arr[i]+"*");
			} else if(arr[i]%2 ==0 && arr[i+1]%2 == 0) {
				System.out.print(arr[i]+"#");
			} else {
				System.out.print(arr[i]+"$");
			}
		}
		System.out.println(arr[arr.length-1]);
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		specialCharacter(arr);
	}
}